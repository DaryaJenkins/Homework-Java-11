package ru.netology.manager;

public class MovieManager {
    private String[] movies = new String[0];

    int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] newArray = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newArray[i] = movies[i];
        }
        newArray[newArray.length - 1] = movie;
        movies = newArray;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}