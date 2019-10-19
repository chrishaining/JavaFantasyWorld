import enemies.Enemy;
import people.Person;

import java.util.ArrayList;

public class Game {

    private ArrayList<Person> players;
    private ArrayList<Enemy> enemies;

    public Game() {
        this.players = new ArrayList<Person>();
        this.enemies = new ArrayList<Enemy>();

    }

    public int countPlayers() {
        return this.players.size();
    }


    public void addPlayer(Person player) {
        this.players.add(player);
    }

    public void removePlayer(Person player) {
        this.players.remove(player);
    }

    public int countEnemies() {
        return this.enemies.size();
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        this.enemies.remove(enemy);
    }

    public String runAFight(Person player, Enemy enemy) {
        player.fight();
        enemy.fight();
        int playerScore = player.getWeaponPower();
        int enemyScore = enemy.getPower();
        if (playerScore > enemyScore) {
            return String.format("%s wins. %s the %s has been defeated.", player.getName(), enemy.getName(), enemy.getClassSimpleName());
        }
        else if (enemyScore > playerScore) {
            this.removePlayer(player);
            return String.format("%s the %s wins. %s has been killed.", enemy.getName(), enemy.getClassSimpleName(), player.getName());
        }
        else {
            return "It's a draw.";
        }
    }

}
// there are different ways to do a fight.
// one way is just to compare the power of each fighter.
// another way is to use rock paper scissors method
// it might be useful for the enemies to have different weapons from the goodies?