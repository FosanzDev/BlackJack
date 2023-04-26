package com.fosanzdev.BlackJack.Players;

import com.fosanzdev.BlackJack.Cartas.Mano;

public abstract class Jugador {

    protected String nombre;
    protected int dinero;
    protected int apuesta;
    protected Mano mano;

    public Jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.apuesta = 0;
        this.mano = new Mano();
    }
}