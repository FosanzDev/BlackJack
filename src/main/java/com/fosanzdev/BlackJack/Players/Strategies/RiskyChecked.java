package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.Game.Mesa;

public class RiskyChecked extends Strategy implements IStrategy{

    public RiskyChecked(Mesa mesa){
        super(mesa);
        strategies.add(this);
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
