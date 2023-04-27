package com.fosanzdev.BlackJack.Players.Strategies;

public class Agressive implements Strategy{

    // Agressive strategy

    public boolean hit(int score){
        return score < 17;
    }

}
