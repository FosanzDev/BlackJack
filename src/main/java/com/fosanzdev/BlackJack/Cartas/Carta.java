package com.fosanzdev.BlackJack.Cartas;

public class Carta {
    private Palos palo;
    private Valores valor;

    public Carta(Palos palo, Valores valor) {
        this.palo = palo;
        this.valor = valor;
    }

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
