package com.kr.view;

import com.kr.models.Player;

/**
 * Created by kot on 03.08.14.
 */
public class Field {

    private com.kr.models.Field field;

    private Player[] players;

    private int currentPlayer;

    private int move;

    private static final char[] chars = {
            '_',
            '*',
            'o'
    };

    public void setField(com.kr.models.Field field)
    {
        this.field = field;
    }

    public void setPlayers(Player[] players)
    {
        this.players = players;
    }

    public void setMove(int move)
    {
        this.move = move;
    }

    public void setCurrentPlayer(int currentPlayer)
    {
        this.currentPlayer = currentPlayer;
    }

    public void show()
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        System.out.println(
                " Move #" + this.move + ". " + this.players[this.currentPlayer].getName()
        );
        System.out.println(
                "Score: "
                + this.players[0].getName() + "(" + this.players[0].getScore() + ")"
                + this.players[1].getName() + "(" + this.players[1].getScore() + ")"
        );


        System.out.print(' ');
        for (int i = 0; i < this.field.FIELD_SIZE; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < this.field.FIELD_SIZE; i++) {
            System.out.print(i);
            for (int j = 0; j < this.field.FIELD_SIZE; j++) {
                System.out.print('|');
                System.out.print(chars[this.field.getField()[i][j]]);
            }
            System.out.println('|');
        }

        System.out.print("Input your move (x, y):");
    }

}
