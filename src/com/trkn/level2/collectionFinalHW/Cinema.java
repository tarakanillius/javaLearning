package com.trkn.level2.collectionFinalHW;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Cinema {
    private final TreeMap<Integer, List<Film>> films;

    public Cinema() {
        this.films = new TreeMap<>();
    }

    public void addFilm(Film film) {
        if (films.containsKey(film.getYear())) {
            films.get(film.getYear()).add(film);
        } else {
            List<Film> temp = new ArrayList<>();
            temp.add(film);
            films.put(film.getYear(), temp);
        }
    }

    public List<Film> getFilmsByYear(int year) {
        return films.get(year);
    }

    public List<Film> getFilmsByYearAndMonth(int year, int month) {
        List<Film> temp = new ArrayList<>();
        for (Film film : films.get(year)) {
            if (film.getMonth() == month) {
                temp.add(film);
            }
        }
        return temp;
    }

    public List<Film> getFilmByGenre(Genre genre) {
        List<Film> temp = new ArrayList<>();
        for (List<Film> films : films.values()) {
            for (Film film : films) {
                if (film.getGenre() == genre) {
                    temp.add(film);
                }
            }
        }
        return temp;
    }

    public List<Film> getTopTenFilmsByRating() {
        List<Film> temp = new ArrayList<>();
        for (List<Film> films : films.values()) {
            temp.addAll(films);
        }
        temp.sort((o1, o2) -> o2.getRating() - o1.getRating());
        return temp.subList(0, Math.min(temp.size(), 10));
    }

}
