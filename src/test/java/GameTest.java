import com.sun.tools.javac.comp.Enter;
import org.junit.Before;
import org.junit.Test;
import people.Entertainer;
import people.Person;
import people.Warrior;
import people.Wizard;

import static org.junit.Assert.assertEquals;


public class GameTest {

    Game game;
    Wizard player1;
    Warrior player2;
    Entertainer player3;

    @Before
    public void before() {
        game = new Game();
        player1 = new Wizard("Thelma");
        player2 = new Warrior("Louise");
        player3 = new Entertainer("Lady Gaga");

    }

    //game has a list of players, and this list starts empty
    @Test
    public void gameStartsWithNoPlayers() {
        assertEquals(0, game.countPlayers());
    }

    //can add players to the list of players
    @Test
    public void canAddPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.countPlayers());
    }

    //can remove players from the list of players (that is, players die)
    @Test
    public void canRemovePlayer() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.removePlayer(player1);
        assertEquals(1, game.countPlayers());

    }

    //players can fight an enemy

    //there is a winner (the last player standing) - unless they all get killed!
}
