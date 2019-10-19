import enemies.Dragon;
import enemies.Enemy;
import enemies.EvilWizard;
import enemies.Heckler;
import people.Entertainer;
import people.Person;
import people.Warrior;
import people.Wizard;
import weapons.Joke;
import weapons.MagicSpell;
import weapons.Sword;

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
        System.out.println(String.format("%s fights %s...", player.getName(), enemy.getName()));
        System.out.println(player.fight());
        System.out.println(enemy.fight());
        int playerScore = player.getWeaponPower();
        int enemyScore = enemy.getPower();
        if (playerScore > enemyScore) {
            this.removeEnemy(enemy);
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

    public void play() {
        Wizard player1;
        Warrior player2;
        Entertainer player3;
        EvilWizard enemy1;
        Dragon enemy2;
        Heckler enemy3;
        MagicSpell weapon1;
        Sword weapon2;
        Joke weapon3;

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

        this.addPlayer(player1);
        this.addPlayer(player2);
        this.addPlayer(player3);
        this.addEnemy(enemy1);
        this.addEnemy(enemy2);
        this.addEnemy(enemy3);

        System.out.println(this.runAFight(player1, enemy1));
        System.out.println(this.runAFight(player2, enemy2));
        System.out.println(this.runAFight(player3, enemy2));

        System.out.println("The surviving players are: ");
        for (Person person : this.players) {
            System.out.println(String.format("%s.", person.getName()));
        }

        System.out.println("The surviving enemies are: ");
        for (Enemy enemy : this.enemies) {
            System.out.println(String.format("%s.", enemy.getName()));
        }


    }

    

//    public void keepPlayingTillOnlyOneSurvives() {
//        while (this.countPlayers() > 0 && this.countEnemies() > 0) {
//            this.play();
//        }
//    }

}
