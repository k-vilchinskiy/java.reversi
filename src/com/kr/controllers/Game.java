package com.kr.controllers;

import com.kr.models.Field;
import com.kr.models.Player;

/**
 * Created by kot on 03.08.14.
 */
public class Game {

    private Field field;

    private Player[] players;

    public Game()
    {
        this.field = new Field();
    }

    public void setPlayers(Player[] players)
    {
        this.players = players;
    }

    public void start()
    {
        com.kr.view.Field fieldView = new com.kr.view.Field();

        fieldView.show(this.field);
    }

}
