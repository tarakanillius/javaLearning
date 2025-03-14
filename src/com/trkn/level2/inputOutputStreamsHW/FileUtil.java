package com.trkn.level2.inputOutputStreamsHW;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class FileUtil {
    private FileUtil() {}

    // Reads the first line of a CSV file and returns it as a list of column headers
    public static List<String> getHeaders(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath)) {
            return lines.findFirst()
                    .map(line -> Arrays.asList(line.split(",")))
                    .orElseThrow(() -> new IOException("File is empty: " + filePath));
        }
    }

    // Returns a list of final headers from both files, combining unique headers from both files
    public static List<String> getFinalHeaders(List<String> headers1, List<String> headers2) {
        Set<String> allHeaders = new LinkedHashSet<>(headers1);
        allHeaders.addAll(headers2);
        return new ArrayList<>(allHeaders);
    }

    // Finds and returns the first common column header between two lists of headers
    public static String getCommonHeader(List<String> headers1, List<String> headers2) {
        return headers1.stream()
                .filter(headers2::contains)
                .findFirst()
                .orElseThrow();
    }

    // Processes a file, reads its contents, and writes data to a map
    private static void processFile(Path filePath, String commonHeader, Map<Integer, Map<String, String>> mergedDataMap, Path errorLogPath) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String[] headers = reader.readLine().split(",");

            // Find the index of the common header in the headers
            int commonHeaderIndex = Arrays.asList(headers).indexOf(commonHeader);
            if (commonHeaderIndex == -1) {
                throw new IOException("Column " + commonHeader + " not found in file " + filePath);  // Throw error if common header not found
            }

            String line;
            // Process each line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into values based on commas
                String[] values = line.split(",");

                // If the number of values in the line is less than the number of headers, log the error
                if (values.length < headers.length) {
                    Files.writeString(errorLogPath, line + "\n", StandardOpenOption.APPEND);  // Append error line to the log
                    continue;
                }

                // Get the ID from the common header column (based on the index)
                int recordKey = Integer.parseInt(values[commonHeaderIndex].trim());

                // If the record key doesn't exist in the map, create a new map for this key
                mergedDataMap.computeIfAbsent(recordKey, k -> new HashMap<>());

                // Add the corresponding values for each header to the map
                for (int i = 0; i < headers.length; i++) {
                    mergedDataMap.get(recordKey).put(headers[i].trim(), values[i].trim());  // Store the value associated with each header
                }
            }
        }
    }

    // Merges data from two CSV files based on a common header and writes the result to an output file
    public static void mergeFiles(Path filePath1, Path filePath2, Path result, Path errorLogPath) throws IOException {
        // Read headers from both files
        List<String> headers1 = getHeaders(filePath1);
        List<String> headers2 = getHeaders(filePath2);

        // Find the common header between the two files
        String commonHeader = getCommonHeader(headers1, headers2);

        // Combine headers from both files and eliminate duplicates (preserving insertion order)
        List<String> finalHeaders = getFinalHeaders(headers1, headers2);

        System.out.println("Headers 1: " + headers1 + "\nHeaders 2: " + headers2 + "\nCommon header: " + commonHeader + "\nFinal headers: " + finalHeaders + "\nMerging files...");

        // Create a map to store merged data (using TreeMap to maintain sorting by record key)
        Map<Integer, Map<String, String>> mergedDataMap = new TreeMap<>();

        // Process both files and add their data to the merged data map
        processFile(filePath1, commonHeader, mergedDataMap, errorLogPath);
        processFile(filePath2, commonHeader, mergedDataMap, errorLogPath);

        // Write the merged data to the result file
        try (BufferedWriter writer = Files.newBufferedWriter(result)) {
            // Write the combined headers as the first row in the output file
            writer.write(String.join(",", finalHeaders));
            writer.newLine();

            // Write each row of data
            for (Map<String, String> rowData : mergedDataMap.values()) {
                // For each row, join the data values according to the final headers
                String row = finalHeaders.stream()
                        .map(rowData::get)  // Get the value for each header
                        .collect(Collectors.joining(","));
                writer.write(row);
                writer.newLine();
            }
        }

        System.out.println("Files merged successfully.");
    }
}