package weapons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JokeBookTest {

    JokeBook jokeBook;
    @Before
    public void before() {
        jokeBook = new JokeBook(5);
    }


    @Test
    public void hasPower() {
        assertEquals(5, jokeBook.getPower());
    }

    @Test
    public void startsWithNoJokes() {
        assertEquals(0, jokeBook.countJokes());
    }

    @Test
    public void canAddJoke() {
        jokeBook.addJoke("France", "Paris");
        assertEquals(1, jokeBook.countJokes());
    }

    //tests that the data type produced for jokes is correct. Due to the randomness, I cannot predict the actual result.
//    @Test
//    public void canGetRandomJokeAnswer() {
//        jokeBook.addJoke("France", "Paris");
//        jokeBook.addJoke("Germany", "Berlin");
//        jokeBook.addJoke("Russia", "Moscow");
//        assertEquals("Paris", jokeBook.getRandomJokeAnswer());
//    }
//
//    @Test
//    public void canGetRandomJokeQuestion() {
//        jokeBook.addJoke("France", "Paris");
//        jokeBook.addJoke("Germany", "Berlin");
//        jokeBook.addJoke("Russia", "Moscow");
//        assertEquals("Germany", jokeBook.getRandomJokeQuestion());
//    }
//
//    @Test
//    public void canGetRandomJoke() {
//        jokeBook.addJoke("France", "Paris");
//        jokeBook.addJoke("Germany", "Berlin");
//        jokeBook.addJoke("Russia", "Moscow");
//        assertEquals("Germany", jokeBook.getRandomJoke());
//    }

}


