package com.fosanzdev.BlackJack.Players;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Players.Strategies.IStrategy;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

public class JugadorIA extends Jugador{

    private final Strategy strategy;

    public JugadorIA(String nombre, int dinero, Strategy strategy) {
        super(nombre, dinero);
        this.strategy = strategy;
    }
}
