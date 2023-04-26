package com.fosanzdev.BlackJack.Cartas;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;

public class Baraja {

    private JArrayList<Carta> baraja;

    public Baraja() {
        baraja = new JArrayList<>();
        for (Palos palo : Palos.values()) {
            for (Valores valor : Valores.values()) {
                baraja.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar() {
        JArrayList<Carta> barajaAux = new JArrayList<>();
        while (!baraja.isEmpty()) {
            int random = (int) (Math.random() * baraja.size());
            barajaAux.add(baraja.get(random));
            baraja.del(random);
        }
        baraja = barajaAux;
    }

    public Carta getCarta() {
        Carta carta = baraja.get(0);
        baraja.del(0);
        return carta;
    }

    public int getNumCartas() {
        return baraja.size();
    }
}
