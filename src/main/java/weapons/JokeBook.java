package weapons;

import java.util.HashMap;
import java.util.Random;

public class JokeBook extends Weapon {

    private HashMap<String, String>jokes;

    public JokeBook(int power) {
        super(power);
        this.jokes = new HashMap<String, String>();
    }

    public int countJokes() {
        return this.jokes.size();
    }

    public void addJoke(String question, String answer) {
        this.jokes.put(question, answer);
    }

    public String getRandomJokeAnswer() {
        Object[] keysList = this.jokes.keySet().toArray();
        Object key = keysList[new Random().nextInt(keysList.length)];
        return this.jokes.get(key);
    }


    public Object getRandomJokeQuestion() {
        Object[] keysList = this.jokes.keySet().toArray();
        Object key = keysList[new Random().nextInt(keysList.length)];
        return key;
    }

    public String getRandomJoke() {
        Object[] keysList = this.jokes.keySet().toArray();
        Object key = keysList[new Random().nextInt(keysList.length)];
        return key + " ... " + this.jokes.get(key);
    }

public String getNoise() {
        return this.getRandomJoke();
}


}
