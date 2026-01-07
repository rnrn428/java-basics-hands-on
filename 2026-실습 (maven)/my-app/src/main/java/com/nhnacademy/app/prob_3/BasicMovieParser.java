package com.nhnacademy.app.prob_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicMovieParser implements MovieParser {
    @Override
    public List<Movie> parse() throws IOException {

        List<Movie> movieList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(getMovieFileAsStream()));

        reader.readLine();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");

            long movieId = Long.parseLong(parts[0]);
            String title = parts[1];
            String genresStr = parts[2];

            Set<String> genres = Arrays.stream(genresStr.split("\\|"))
                    .collect(Collectors.toSet());

            movieList.add(new Movie(movieId, title, genres));
        }

        return movieList;
    }

}
