package com.fosanzdev.BlackJack.Players;

import com.fosanzdev.BlackJack.Cartas.Carta;
import com.fosanzdev.BlackJack.Cartas.Mano;
public class JugadorHumano extends Jugador{

    public JugadorHumano(String nombre, int dinero) {
        super(nombre, dinero);
    }

    // Setters

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    // Getters

    public int getApuesta() {
        return apuesta;
    }

    public int getDinero() {
        return dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public Mano getMano() {
        return mano;
    }

    // Methods

    public void addDinero(int dinero) {
        this.dinero += dinero;
    }

    public void removeDinero(int dinero) {
        this.dinero -= dinero;
    }

    public void addApuesta(int apuesta) {
        this.apuesta += apuesta;
    }

    public void addCartaMano(Carta carta) {
        mano.addCarta(carta);
    }

    public void clearMano() {
        mano.clear();
    }
}
