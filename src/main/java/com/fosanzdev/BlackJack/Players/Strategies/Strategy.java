package com.fosanzdev.BlackJack.Players.Strategies;

public interface Strategy {
    public boolean hit(int score);
    public boolean doubleIt(int score);
    public boolean split(int score);
    public boolean secure(int score);
}
