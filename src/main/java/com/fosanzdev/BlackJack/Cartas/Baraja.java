package com.fosanzdev.BlackJack.Cartas;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;

public class Baraja {

    private JArrayList<Carta> baraja;

    /**
     * Creacion de las combinaciones Palo-Valor
     */
    public Baraja() {
        baraja = new JArrayList<>();
        for (Palos palo : Palos.values()) {
            for (Valores valor : Valores.values()) {
                baraja.add(new Carta(palo, valor));
            }
        }
    }

    /**
     * Barajar las cartas con una baraja auxiliar
     */
    public void barajar() {
        JArrayList<Carta> barajaAux = new JArrayList<>();
        while (!baraja.isEmpty()) {
            int random = (int) (Math.random() * baraja.size());
            barajaAux.add(baraja.get(random));
            baraja.del(random);
        }
        baraja = barajaAux;
    }

    /**
     * Coger una carta de la baraja
     * @return Carta superior de la baraja
     */
    public Carta getCarta() {
        Carta carta = baraja.get(0);
        baraja.del(0);
        return carta;
    }

    /**
     * Calcula el numero de cartas restantes
     * @return int con el número de cartas
     */
    public int getNumCartas() {
        return baraja.size();
    }
}
