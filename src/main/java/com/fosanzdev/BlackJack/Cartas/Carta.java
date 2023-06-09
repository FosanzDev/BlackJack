package com.fosanzdev.BlackJack.Cartas;

/**
 * Clase Carta
 * Contiene el palo y el valor de la carta
 */
public class Carta {
    private Palos palo;
    private Valores valor;

    // Constructor
    public Carta(Palos palo, Valores valor) {
        this.palo = palo;
        this.valor = valor;
    }

    //Getters

    public Palos getPalo() {
        return palo;
    }

    public Valores getValor() {
        return valor;
    }

    public int getNumValue() {
        return valor.getNumValue();
    }
}
