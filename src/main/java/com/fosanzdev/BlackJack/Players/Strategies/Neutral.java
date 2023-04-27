package com.fosanzdev.BlackJack.Players.Strategies;

public class Neutral implements Strategy{

    // Neutral strategy

    // Hit if score is less than 17
    public boolean hit(int score){
        return score < 17;
    }

    // Double if score is between 9 and 11
    public boolean doubleIt(int score){
        return score >= 9 && score <= 11;
    }

    // Never split
    public boolean split(int score){
        return false;
    }

    // Always secure
    public boolean secure(int score){
        return true;
    }
}
