package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> keys = new ArrayList<>();
        String key = reader.readLine();

        while (key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera")) {
            keys.add(key);
            key = reader.readLine();
        }

        keys.add(key);

        for (int i = 0; i < keys.size(); i++) {
            Movie movie = MovieFactory.getMovie(keys.get(i));
            if (movie != null) {
                System.out.println(movie.getClass().getSimpleName());
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
        Movie movie;
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}
