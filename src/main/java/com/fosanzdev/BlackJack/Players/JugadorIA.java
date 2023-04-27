package com.fosanzdev.BlackJack.Players;

import com.fosanzdev.BlackJack.Cartas.Mano;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

public class JugadorIA extends Jugador{

    private final Strategy strategy;

    public JugadorIA(String nombre, int dinero, Strategy strategy) {
        super(nombre, dinero);
        this.strategy = strategy;
    }

    public boolean willHit(Mano mano){
        return true;
    }
}
