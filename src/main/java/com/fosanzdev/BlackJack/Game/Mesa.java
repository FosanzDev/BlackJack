package com.fosanzdev.BlackJack.Game;

import com.fosanzdev.BlackJack.Cartas.Baraja;
import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.JugadorIA;

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

    public void repartirCartas(){
        for (int i = 0; i < 2; i++) {
            for (Jugador jugador : jugadores) {
                jugador.mano.addCarta(mazo.getCarta());
            }
            crupier.mano.addCarta(mazo.getCarta());
            crupier.mano.addCarta(mazo.getCarta());
        }
    }

    public void nuevoMazo(){
        this.mazo = new Baraja();
        this.mazo.barajar();
    }

    public JArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void repartirCarta(Jugador jugador){
        jugador.mano.addCarta(mazo.getCarta());
    }

}
