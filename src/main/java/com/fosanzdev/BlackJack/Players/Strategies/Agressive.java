package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.Cartas.Mano;
import com.fosanzdev.BlackJack.Game.Mesa;
import com.fosanzdev.BlackJack.Players.JugadorIA;

public class Agressive extends Strategy {


    public boolean hit(int score, Mano mano, Mesa mesa) {
        return false;
    }

    public boolean doubleIt(int score, Mano mano, Mesa mesa) {
        return false;
    }

    public boolean split(int score, Mano mano, Mesa mesa) {
        return false;
    }

    public boolean secure(int score, Mano mano, Mesa mesa) {
        return false;
    }
}
