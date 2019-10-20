import behaviours.IFight;
import enemies.Dragon;
import enemies.Enemy;
import enemies.EvilWizard;
import enemies.Heckler;
import people.Entertainer;
import people.Person;
import people.Warrior;
import people.Wizard;
import weapons.JokeBook;
import weapons.MagicSpell;
import weapons.Sword;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private ArrayList<Person> players;
    private ArrayList<Enemy> enemies;
    private ArrayList<IFight> finalists;

    public Game() {
        this.players = new ArrayList<Person>();
        this.enemies = new ArrayList<Enemy>();
        this.finalists = new ArrayList<IFight>();

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

    public int countFinalists() {
        return this.finalists.size();
    }

    public void addFinalist(IFight finalist) {this.finalists.add(finalist);}

    public void removeFinalist(IFight finalist) {this.finalists.remove(finalist);}

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

    public void murder() {
        Random rand = new Random();
        Person murderousPlayer = players.get(rand.nextInt(players.size()));
        String murderousPlayerName = murderousPlayer.getName();
        players.remove(murderousPlayer);
        this.addFinalist(murderousPlayer);
        String losingPlayerName = players.get(0).getName();
        System.out.println(String.format("%s has murdered %s.", murderousPlayerName, losingPlayerName));

        Random randTwo = new Random();
        Enemy murderousEnemy = enemies.get(randTwo.nextInt(enemies.size()));
        String murderousEnemyName = murderousEnemy.getName();
        enemies.remove(murderousEnemy);
        this.addFinalist(murderousEnemy);
        String losingEnemyName = enemies.get(0).getName();
        System.out.println(String.format("%s has murdered %s.", murderousEnemyName, losingEnemyName));

        System.out.println();
        System.out.println(String.format("That means the two remaining fighters are %s and %s.", murderousPlayerName, murderousEnemyName));
    }

    public void playFinal() {
        System.out.println();
        System.out.println("In a dramatic fight to the death, a victor has emerged ... ");

        Random randThree = new Random();
        IFight winner = finalists.get(randThree.nextInt(finalists.size()));
        if (winner.getClass().getName().contains("enemies")) {
            Enemy enemy = (Enemy) winner;
            System.out.println(enemy.getName() + " takes the prize.");
        }
        else {
            Person person = (Person) winner;
            System.out.println(person.getName() + " takes the prize.");
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
        JokeBook weapon3;

        player1 = new Wizard("Thelma");
        player2 = new Warrior("Louise");
        player3 = new Entertainer("Frankie Boyle");
        weapon1 = new MagicSpell(1);
        weapon2 = new Sword(5);
        weapon3 = new JokeBook(3);


        player1.setWeapon(weapon1);
        player2.setWeapon(weapon2);
        player3.setWeapon(weapon3);

        weapon3.addJoke("Why don’t pirates take a shower before they walk the plank?", " They just wash up on shore");
        weapon3.addJoke("The machine at the coin factory just suddenly stopped working, with no explanation.", "It doesn’t make any cents");
        weapon3.addJoke("Did you hear about the man who sued an airline company after it lost his luggage?", "Sadly, he lost his case" +
                "");

        enemy1 = new EvilWizard("Agatha", 5);
        enemy2 = new Dragon("Fireball", 1);
        enemy3 = new Heckler("Jez", 3);

        this.addPlayer(player1);
        this.addPlayer(player2);
        this.addPlayer(player3);
        this.addEnemy(enemy1);
        this.addEnemy(enemy2);
        this.addEnemy(enemy3);

        System.out.println("Welcome to the Java Fantasy World. Our three heroes are the warrior, the wizard and the entertainer. They will do battle against three masters of evil: the evil wizard, the dragon and the heckler. Let's see how this goes... \n");

        System.out.println(this.runAFight(player1, enemy1));
        System.out.println();
        System.out.println(this.runAFight(player2, enemy2));
        System.out.println();
        System.out.println(this.runAFight(player3, enemy3));

        System.out.println("The surviving players are: ");
        for (Person person : this.players) {
            System.out.println(String.format("%s.", person.getName()));
        }

        System.out.println();
        System.out.println("The surviving enemies are: ");
        for (Enemy enemy : this.enemies) {
            System.out.println(String.format("%s.", enemy.getName()));
        }

        System.out.println("\n");
        System.out.println("The fighters are tired, and go to sleep for the night, ready for a new round of battles tomorrow. \n");
        System.out.println("There's been a surprise development. During the night, two of the fighters have been murdered... ");

        this.murder();
        this.playFinal();
//
    }
}







