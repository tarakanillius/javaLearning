package com.trkn.level2.collectionFinalHW;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = getCinema();

        System.out.println("Films in 2023:");
        List<Film> films2023 = cinema.getFilmsByYear(2023);
        for (Film film : films2023) {
            System.out.println(film);
        }

        System.out.println("\nFilms in 2023, May:");
        List<Film> films2023May = cinema.getFilmsByYearAndMonth(2023, 5);
        for (Film film : films2023May) {
            System.out.println(film);
        }

        System.out.println("\nAction Films:");
        List<Film> actionFilms = cinema.getFilmByGenre(Genre.Action);
        for (Film film : actionFilms) {
            System.out.println(film);
        }

        System.out.println("\nTop Ten Films by Rating:");
        List<Film> topFilms = cinema.getTopTenFilmsByRating();
        for (Film film : topFilms) {
            System.out.println(film);
        }
    }

    private static Cinema getCinema() {
        Cinema cinema = new Cinema();

        Film film1 = new Film(1, 2023, 5, Genre.Action, 85);
        Film film2 = new Film(2, 2023, 5, Genre.Comedy, 90);
        Film film3 = new Film(3, 2022, 8, Genre.Drama, 75);
        Film film4 = new Film(4, 2023, 5, Genre.Horror, 80);
        Film film5 = new Film(5, 2023, 6, Genre.Action, 95);
        Film film6 = new Film(6, 2022, 8, Genre.Thriller, 88);

        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        cinema.addFilm(film4);
        cinema.addFilm(film5);
        cinema.addFilm(film6);
        return cinema;
    }
}
