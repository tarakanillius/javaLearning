package com.trkn.level2.collectionFinalHW;

public class Film {
    private final int id;
    private final int year;
    private final int month;
    private final Genre genre;
    private final int rating;

    public Film(int id, int year, int month, Genre genre, int rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
