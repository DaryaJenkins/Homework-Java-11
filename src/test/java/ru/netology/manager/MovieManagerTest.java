package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void findAllIfNoMovies() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void findLastIfNoMovies() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void findAllIfOnlyOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперёд");
        String[] expected = { "Вперёд" };
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void findAllTheSevenMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = { "Бладшот", "Вперёд", "Отель «Белград»", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один" };
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void findLastIfMoviesMatchLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");

        String[] expected = { "Человек-невидимка", "Джентльмены", "Отель «Белград»", "Вперёд", "Бладшот" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void findLastIfMoviesUnderLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");

        String[] expected = { "Джентльмены", "Отель «Белград»", "Вперёд", "Бладшот" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void findLastIfMoviesAboveLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель «Белград»" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void findOnlyOneLastMovie() {
        MovieManager manager = new MovieManager(1);
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        String[] expected = {"Джентльмены"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void findThreeLastMovies() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void findSevenLastMovies() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель «Белград»");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель «Белград»", "Вперёд", "Бладшот" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}