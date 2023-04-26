package com.fosanzdev.BlackJack.Cartas;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;

public class Mano {

    private final JArrayList<Carta> cartas;

    /**
     * Constructor de la clase Mano
     */
    public Mano() {
        cartas = new JArrayList<>();
    }

    /**
     * Añade una carta a la mano
     * @param carta Carta a añadir
     */
    public void addCarta(Carta carta) {
        cartas.add(carta);
    }

    /**
     * Resetea la mano
     */
    public void clear() {
        cartas.clear();
    }

    public int getSum(){
        // Suma de las cartas de la mano
        boolean as = false;
        int sum = 0;

        // Recorremos las cartas de la mano
        for(Carta c: cartas){

            // Si la carta es un as, cambiamos el valor de as a true
            // if(c.getNumValue() == 1){
            if(c.getValor() == Valores.AS){
                as = true;
            }

            // Sumamos el valor de la carta a la suma total
            sum += c.getNumValue();
        }

        // Si la suma es menor o igual a 11 y hay un as, sumamos 10
        if(as && sum <= 11){
            sum += 10;
        }

        // Devolvemos la suma
        return sum;
    }
}
