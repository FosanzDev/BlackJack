package com.fosanzdev.BlackJack.Game;

import com.fosanzdev.BlackJack.Cartas.Baraja;
import com.fosanzdev.BlackJack.Cartas.Mano;
import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.JugadorIA;

public class Mesa {

    private JArrayList<Jugador> jugadores;
    private JugadorIA crupiere;
    private Baraja mazo;

    public Mesa(JArrayList<Jugador> jugadores, JugadorIA crupiere){
        this.jugadores = jugadores;
        this.crupiere = crupiere;
        this.mazo = new Baraja();
        this.mazo.barajar();
    }

    public void repartirCartas(){
        for (int i = 0; i < 2; i++) {
            for (Jugador jugador : jugadores) {
                jugador.mano.addCarta(mazo.getCarta());
            }
            crupiere.mano.addCarta(mazo.getCarta());
            crupiere.mano.addCarta(mazo.getCarta());
        }
    }

    public void nuevoMazo(){
        this.mazo = new Baraja();
        this.mazo.barajar();
    }

    public void repartirCarta(Jugador jugador){
        jugador.mano.addCarta(mazo.getCarta());
    }


}
