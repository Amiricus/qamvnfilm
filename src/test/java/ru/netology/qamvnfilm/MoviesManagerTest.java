package ru.netology.qamvnfilm;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void shouldAddMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = { "First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");

        String[] expected = { "First" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotAddMovies() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllLast10Movies() {
        MoviesManager manager = new MoviesManager(10);

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllLast5Movies() {
        MoviesManager manager = new MoviesManager(5);

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllLast15Movies() {
        MoviesManager manager = new MoviesManager(15);

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
