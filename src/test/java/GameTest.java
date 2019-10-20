import com.sun.tools.javac.comp.Enter;
import enemies.Dragon;
import enemies.EvilWizard;
import enemies.Heckler;
import org.junit.Before;
import org.junit.Test;
import people.Entertainer;
import people.Person;
import people.Warrior;
import people.Wizard;
import weapons.Joke;
import weapons.MagicSpell;
import weapons.Sword;

import static org.junit.Assert.assertEquals;


public class GameTest {

    Game game;
    Wizard player1;
    Warrior player2;
    Entertainer player3;
    EvilWizard enemy1;
    Dragon enemy2;
    Heckler enemy3;
    MagicSpell weapon1;
    Sword weapon2;
    Joke weapon3;

    @Before
    public void before() {
        game = new Game();
        player1 = new Wizard("Thelma");
        player2 = new Warrior("Louise");
        player3 = new Entertainer("Lady Gaga");
        weapon1 = new MagicSpell(1);
        weapon2 = new Sword(5);
        weapon3 = new Joke(3);
        player1.setWeapon(weapon1);
        player2.setWeapon(weapon2);
        player3.setWeapon(weapon3);
        enemy1 = new EvilWizard("Agatha", 5);
        enemy2 = new Dragon("Fireball", 1);
        enemy3 = new Heckler("Jez", 3);

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

    @Test
    public void gameStartsWithNoEnemies() {
        assertEquals(0, game.countEnemies());
    }

    @Test
    public void canAddEnemy() {
        game.addEnemy(enemy1);
        assertEquals(1, game.countEnemies());
    }

    @Test
    public void canRemoveEnemy() {
        game.addEnemy(enemy1);
        game.addEnemy(enemy2);
        game.removeEnemy(enemy1);
        assertEquals(1, game.countEnemies());
    }

    //game can run a fight between a player and an enemy
    @Test
    public void canRunAFightEnemyWins() {
        game.addPlayer(player1);
        game.addEnemy(enemy1);
        assertEquals("Agatha the EvilWizard wins. Thelma has been killed.", game.runAFight(player1, enemy1));
    }

    @Test
    public void canRunAFightPlayerWins() {
        game.addPlayer(player2);
        game.addEnemy(enemy2);
        assertEquals("Louise wins. Fireball the Dragon has been defeated.", game.runAFight(player2, enemy2));
    }

    @Test
    public void canRunAFightDraw() {
        game.addPlayer(player3);
        game.addEnemy(enemy3);
        assertEquals("It's a draw.", game.runAFight(player3, enemy3));
    }
    //there is a winner (the last player standing) - unless they all get killed!
    @Test
    public void hasTwoFinalists() {
        game.play();
        assertEquals(2, game.countFinalists());
    }
}
