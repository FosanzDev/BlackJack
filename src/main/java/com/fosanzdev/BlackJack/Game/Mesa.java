package com.fosanzdev.BlackJack.Game;

import com.fosanzdev.BlackJack.Cartas.Baraja;
import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.JugadorIA;

/**
 * Clase mesa
 * Contiene los jugadores y el crupier y representa la mesa de juego
 * Es el encargado de repartir las cartas y de crear los mazos.
 * //TODO: Poder crear un mazo con un numero de barajas (entre 1 y 8 normalmente)
 */
public class Mesa {

    protected final JArrayList<Jugador> jugadores;
    protected final JugadorIA crupier;
    private Baraja mazo;

    public Mesa(JArrayList<Jugador> jugadores, JugadorIA crupiere){
        this.jugadores = jugadores;
        this.crupier = crupiere;
        this.mazo = new Baraja();
        this.mazo.barajar();
    }

    /**
     * Reparte dos cartas a cada jugador y al crupier.
     */
    public void repartirCartas(){
        for (int i = 0; i < 2; i++) {
            for (Jugador jugador : jugadores) {
                jugador.mano.addCarta(mazo.getCarta());
            }
            crupier.mano.addCarta(mazo.getCarta());
            crupier.mano.addCarta(mazo.getCarta());
        }
    }

    /**
     * Crea un nuevo mazo y lo baraja.
     */
    public void nuevoMazo(){
        this.mazo = new Baraja();
        this.mazo.barajar();
    }

    /**
     * Reparte una carta al jugador pasado por parametro.
     * @param jugador Jugador al que se le reparte la carta.
     */
    public void repartirCarta(Jugador jugador){
        jugador.mano.addCarta(mazo.getCarta());
    }

    //Getters
    public JArrayList<Jugador> getJugadores() {
        return jugadores;
    }

}
