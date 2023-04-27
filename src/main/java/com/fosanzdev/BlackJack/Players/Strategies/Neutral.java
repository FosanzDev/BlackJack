package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.Cartas.Mano;
import com.fosanzdev.BlackJack.Game.Mesa;

public class Neutral extends Strategy {

    // Hit if score is less than 17
    public boolean hit(int score, Mano mano, Mesa mesa){
        return score < 17;
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
