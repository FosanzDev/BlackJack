package com.fosanzdev.BlackJack.Game;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Players.JugadorIA;
import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

public class GameFlow {

    public static final int DEFAULT_PLAYERS = 3;
    public static final int DEFAULT_BASE_BET = 10;
    public static final int DEFAULT_PLAYER_MONEY = 500;

    private int numPlayers;
    private int baseBet;
    private int playerMoney;
    private int dealerMoney;
    private Mesa mesa;

    public GameFlow(int numPlayers, int baseBet, int playerMoney, Jugador... jugadores) {
        this.numPlayers = numPlayers;
        this.baseBet = baseBet;
        this.playerMoney = playerMoney;
        this.dealerMoney = playerMoney * numPlayers * 2;
    }

    public GameFlow(Jugador... jugadores) {
        this(DEFAULT_PLAYERS, DEFAULT_BASE_BET, DEFAULT_PLAYER_MONEY, jugadores);
        this.mesa = new Mesa(
                new JArrayList<Jugador>(jugadores),
                new JugadorIA("Crupier", dealerMoney, Strategy.getRandomStrategy())
        );
    }

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

    public void startGame(){
        mesa.nuevoMazo();
    }

    public void startRound(){
        mesa.repartirCartas();
    }
}
