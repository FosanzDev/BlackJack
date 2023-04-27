package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Game.Mesa;

public abstract class Strategy {
    protected static final JArrayList<Strategy> strategies = new JArrayList<>();

    public Strategy(Mesa mesa){
        strategies.add(this);
    }

    public static Strategy getRandomStrategy() {
        return strategies.getRandom();
    }
}
