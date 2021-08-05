package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.objects.Card;

import java.util.ArrayList;

public class BlackjackPlayer implements PlayerInterface {
    private PlayerInterface playerInterface;
    ArrayList<Card> hand;

    public BlackjackPlayer(PlayerInterface playerInterface, ArrayList<Card> hand) {
        this.playerInterface = playerInterface;
        this.hand = hand;
    }

    public BlackjackPlayer() {
    }

    public void setPlayerInterface(PlayerInterface playerInterface) {
        this.playerInterface = playerInterface;
    }


    @Override
    public CasinoAccount getArcadeAccount() {
        return playerInterface.getArcadeAccount();
    }
}