package com.kr.view;

import com.kr.controllers.Game;
import com.kr.models.Player;

import java.util.Scanner;

/**
 * Created by kot on 03.08.14.
 */
public class PlayersMenu {

    public void show() {

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        //Scanner inp = new Scanner(System.in);
        System.out.println(" Input players:");
        System.out.println(" player1 (black) name: black");
        System.out.println(" player2 (white) name: white");

        //todo make players names input
        String player1Name = "black";
        String player2Name = "white";

        Player[] players = {
                new Player(1, player1Name),
                new Player(2, player2Name)
        };

        Game game = new Game();
        game.setPlayers(players);

        game.start();
    }

}
