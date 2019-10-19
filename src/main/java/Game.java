import people.Person;

import java.util.ArrayList;

public class Game {

    private ArrayList<Person> players;

    public Game() {
        this.players = new ArrayList<Person>();
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

}
// there are different ways to do a fight.
// one way is just to compare the power of each fighter.
// another way is to use rock paper scissors method
// it might be useful for the enemies to have different weapons from the goodies?