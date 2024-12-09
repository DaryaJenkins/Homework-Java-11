package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void noMovies() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void onlyOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперёд");
        String[] expected = {"Вперёд"};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void allMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель «Белград»", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void showFiveReversedMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель «Белград»", "Вперёд", "Бладшот"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void showReversedMoviesUnderLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");

        String[] expected = {"Джентльмены", "Отель «Белград»", "Вперёд", "Бладшот"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void showThreeReversedMovies() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void showSevenReversedMovies() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель «Белград»", "Вперёд", "Бладшот"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}