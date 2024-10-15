/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {qa
        return name;
    }

    public abstract void play();
    public abstract int getScore();
}

class SpotItPlayer extends Player {
    private int score;

    public SpotItPlayer(String name) {
        super(name);
        this.score = 0; // Initialize score to zero
    }

    @Override
    public void play() {
        // This method can include specific actions for the player's turn if needed
        System.out.println(getName() + " is ready to play.");
    }

    @Override
    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++; 
    }
}
