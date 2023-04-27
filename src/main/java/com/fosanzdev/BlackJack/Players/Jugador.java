package com.fosanzdev.BlackJack.Players;

import com.fosanzdev.BlackJack.Cartas.Mano;

/**
 * Clase Jugador
 * Define los atributos y métodos de los jugadores
 * Tambien contiene la mano del jugador y su apuesta
 */
public abstract class Jugador {

    protected String nombre;
    protected int dinero;
    protected int apuesta;
    public Mano mano;

    public Jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.apuesta = 0;
        this.mano = new Mano();
    }

    public void setMoney(int dinero){
        this.dinero = dinero;
    }
}
