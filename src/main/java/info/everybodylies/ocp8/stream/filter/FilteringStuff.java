package info.everybodylies.ocp8.stream.filter;

import java.util.Arrays;
import java.util.List;

class Movie {
    static enum Genre {DRAMA, THRILLER, HORROR, ACTION}

    private Genre genre;
    private String name;
    private char rating = 'R';

    public char getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    Movie(String name, Genre genre, char rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;


    }
}

public class FilteringStuff {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", Movie.Genre.DRAMA, 'U'),
                new Movie("Psycho", Movie.Genre.THRILLER, 'U'),
                new Movie("Oldboy", Movie.Genre.THRILLER, 'R'),
                new Movie("Shining", Movie.Genre.HORROR, 'U'));

        notTerminalStream(movies);
        terminalStream(movies);
    }

    private static void terminalStream(List<Movie> movies) {
        movies.stream()
                .peek(mov -> System.out.println(mov.getName()))
                .filter(mov -> mov.getRating() == 'R')
                .map(Movie::getName)
                .forEach(System.out::println);

    }

    private static void notTerminalStream(List<Movie> movies) {
        movies.stream()
                .filter(mov -> mov.getRating() == 'R')
                .peek(mov -> System.out.println(mov.getName()))
                .map(Movie::getName);
    }
}