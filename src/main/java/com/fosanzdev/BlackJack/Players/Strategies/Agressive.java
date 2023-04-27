package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.Game.Mesa;

public class Agressive extends Strategy implements IStrategy {

    public Agressive(Mesa mesa){
        super(mesa);
    }

    // Agressive strategy

    public boolean hit(int score){
        return score < 17;
    }


    public boolean doubleIt(int score) {
        return false;
    }


    public boolean split(int score) {
        return false;
    }


    public boolean secure(int score) {
        return false;
    }

}
