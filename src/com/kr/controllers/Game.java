package com.kr.controllers;

import com.kr.models.Field;
import com.kr.models.Player;

import java.util.Scanner;

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
        fieldView.setPlayers(this.players);

        Scanner inp = new Scanner(System.in);

        boolean game = true;
        int move = 1;
        int currentPlayer = 0;
        while (game) {
            fieldView.setField(this.field);
            fieldView.setMove(move);
            fieldView.setCurrentPlayer(currentPlayer);

            fieldView.show();

            int x = inp.nextInt();
            int y = inp.nextInt();

            if (x == 100) {
                break;
            }

            //в поле игроки нумеруются 1 и 2 (0 - пустая ячейка).
            //а в массиве текущих игроков - 0 и 1.
            this.field.set(x, y, this.players[currentPlayer].getIndex());

            currentPlayer = currentPlayer == 0 ? 1 : 0;
            move++;

            //game = false;
        }
    }

}
