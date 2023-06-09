package com.fosanzdev.BlackJack.Cartas;

/**
 * Enumerado Valores
 * Para cada valor enumerado se le asigna un valor numerico
 */
public enum Valores {
    AS(1), DOS(2), TRES(3), CUATRO(4),
    CINCO(5), SEIS(6), SIETE(7), OCHO(8),
    NUEVE(9), DIEZ(10), JOTA(10), REINA(10), REY(10);

    int numValue;
    Valores(int numValue) {
        this.numValue = numValue;
    }

    public int getNumValue() {
        return numValue;
    }
}
