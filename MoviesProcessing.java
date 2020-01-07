package functional_programming.task3_Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoviesProcessing {

    public static void buildMovieList() {
        List<Movies> movie1 = new ArrayList<>();
        movie1.add(new Movies(67.90, "Horror"));
        movie1.add(new Movies(120.80, "Horror"));
        movie1.add(new Movies(75.20, "Comedy"));

        List<Movies> movie2 = new ArrayList<>();
        movie2.add(new Movies(90.50, "Comedy"));
        movie2.add(new Movies(100.10, "Comedy"));
        movie2.add(new Movies(190.30, "Horror"));

        List<Movies> gatheredMovies = new ArrayList<>(movie1);
        movie1.addAll(movie2);

        Map<String, Double> amountOfPriceOfGenres = gatheredMovies.stream()
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.averagingDouble(Movies::getPrice)));

        Map<String, Long> amountMoviesOfGenres = gatheredMovies.stream()
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.counting()));

        System.out.println(amountOfPriceOfGenres);
        System.out.println(amountMoviesOfGenres);
    }
}
