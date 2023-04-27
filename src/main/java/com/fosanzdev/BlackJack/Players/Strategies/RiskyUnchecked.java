package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.Game.Mesa;

public class RiskyUnchecked extends Strategy implements IStrategy{

    public RiskyUnchecked(Mesa mesa){
        super(mesa);
    }

    public boolean hit(int score) {
        return false;
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
