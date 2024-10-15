/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Game {
    private String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play();
    public abstract void declareWinner();
}

class SpotItGame extends Game {
    private GroupOfCards deck;

    public SpotItGame(String name) {
        super(name);
        this.deck = new GroupOfCards(10); // Reduced deck size for simplicity
        deck.shuffle(); // Shuffle the newly initialized deck
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (Player player : getPlayers()) {
            System.out.println(player.getName() + "'s turn. Choose a card index:");
            for (int i = 0; i < deck.getCards().size(); i++) {
                System.out.println(i + ": " + deck.getCards().get(i));
            }
            int cardIndex = scanner.nextInt();
            System.out.println(player.getName() + " chose: " + deck.getCards().get(cardIndex));
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("Declaring the winner" );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); 
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter player " + (i + 1) + "'s name:");
            String playerName = scanner.nextLine();
            players.add(new SpotItPlayer(playerName));
        }

        SpotItGame game = new SpotItGame("Spot It");
        game.setPlayers(players);
        game.play();
        game.declareWinner();
    }
}
