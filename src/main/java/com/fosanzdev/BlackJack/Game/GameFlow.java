package com.fosanzdev.BlackJack.Game;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Players.JugadorHumano;
import com.fosanzdev.BlackJack.Players.JugadorIA;
import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

public class GameFlow {

    // Default values for the game

    public static final int DEFAULT_PLAYERS = 3;
    public static final int DEFAULT_BASE_BET = 10;
    public static final int DEFAULT_PLAYER_MONEY = 500;


    // Game variables
    private int numPlayers;
    private int baseBet;
    private int playerMoney;
    private int dealerMoney;
    private final Mesa mesa;

    //Constructor
    public GameFlow(int numPlayers, int baseBet, int playerMoney, JugadorHumano jugador) {
        // NOTE: This is the constructor that is called from the main method
        this.numPlayers = numPlayers;
        this.baseBet = baseBet;
        this.playerMoney = playerMoney;
        this.dealerMoney = playerMoney * numPlayers * 2;
        // Add numPlayers-1 random players to the game
        JArrayList<Jugador> players = new JArrayList<Jugador>();
        for (int i = 0; i < numPlayers-1; i++) {
            players.add(new JugadorIA("CPU " + (i + 1), playerMoney, Strategy.getRandomStrategy()));
        }
        // Add the human player to the game
        players.add(jugador);

        // Create the game table
        this.mesa = new Mesa(players, new JugadorIA("Crupier", dealerMoney, Strategy.getRandomStrategy()));
    }

    //TODO Player is only one, not an array

    public GameFlow(JugadorHumano jugador) {
        this(DEFAULT_PLAYERS, DEFAULT_BASE_BET, DEFAULT_PLAYER_MONEY, jugador);
    }

    //Setters
    public void setBaseBet(int baseBet) {
        this.baseBet = baseBet;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

    public void setDealerMoney(int dealerMoney) {
        this.dealerMoney = dealerMoney;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    //TODO: newGame() and startRound() are the same method ???
    public void newGame(){
        mesa.nuevoMazo();
        for (Jugador jugador : mesa.getJugadores()) {
            jugador.setMoney(playerMoney);
        }
        mesa.crupier.setMoney(dealerMoney);
    }

    public void startRound(){
        mesa.repartirCartas();
    }
}
