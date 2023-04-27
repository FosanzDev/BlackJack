package com.fosanzdev.BlackJack.Players.Strategies;

import com.fosanzdev.BlackJack.Cartas.Mano;
import com.fosanzdev.BlackJack.DataStructures.JArrayList;
import com.fosanzdev.BlackJack.Game.Mesa;

public abstract class Strategy {

    //Save all strategies in a list
    public static final JArrayList<Strategy> strategies = new JArrayList<Strategy>(
            new Neutral(),
            new Agressive(),
            new ConservativeChecked(),
            new ConservativeUnchecked(),
            new RiskyChecked(),
            new RiskyUnchecked()
    );

    public abstract boolean hit(int score, Mano mano, Mesa mesa);
    public abstract boolean doubleIt(int score, Mano mano, Mesa mesa);
    public abstract boolean split(int score, Mano mano, Mesa mesa);
    public abstract boolean secure(int score, Mano mano, Mesa mesa);

    public static Strategy getRandomStrategy() {
        return strategies.getRandom();
    }
}