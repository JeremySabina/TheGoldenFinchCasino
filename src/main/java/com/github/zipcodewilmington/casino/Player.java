package com.github.zipcodewilmington.casino;

public class Player implements PlayerInterface{
    //retains the information about player including balance once game is over


     private String name;
     private CasinoAccount arcadeAccount;
     private Float balance;
     private Float currentBet;

     public Player(String name, CasinoAccount arcadeAccount) {
        this.name = name;
        this.arcadeAccount = arcadeAccount;
    }


    public float getBalance() {
        return balance;
    }

    public void setBalance(Float deposit) {
        this.balance = deposit;
    }

    public void setCurrentBet(Float currentBet) {
        this.currentBet = currentBet;
    }

    public float getCurrentBet() {
        return currentBet;
    }

    public Float makeBet(Float betAmount) {
        currentBet = betAmount;
        balance = balance - currentBet;
        return currentBet;
    }

    public void setArcadeAccount(CasinoAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    public String getName() {
        return name;
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        return this.arcadeAccount;
    }

}


//    @Override
//    public <SomeReturnType> SomeReturnType play() {
//        return null;
//    }
