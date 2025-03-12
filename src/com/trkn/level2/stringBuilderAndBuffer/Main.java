package com.trkn.level2.stringBuilderAndBuffer;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        String string = "";
//        for (int i = 0; i < 1000; i++) {
//            string += i;
//        }
// В данном случае, StringBuilder работает быстрее, чем StringBuffer, потому что он не требует синхронизации, что делает его быстрее больше чем в 300 раз
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            string.append(i) ;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
