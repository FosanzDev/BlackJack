package com.fosanzdev.BlackJack.Players;

import com.fosanzdev.BlackJack.Cartas.Mano;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

/**
 * Clase JugadorIA
 * Define los atributos y métodos de los jugadores IA
 * //TODO: Completar los métodos
 */
public class JugadorIA extends Jugador{

    private final Strategy strategy;

    public JugadorIA(String nombre, int dinero, Strategy strategy) {
        super(nombre, dinero);
        this.strategy = strategy;
    }
}
