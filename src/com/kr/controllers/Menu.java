package com.kr.controllers;

import com.kr.view.MainMenu;
import com.kr.view.PlayersMenu;
import com.kr.view.Welcome;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kot on 03.08.14.
 */
public class Menu {

    private Game game;

    private MainMenu mainMenu;

    public void run() throws IOException {
        new Welcome().show();

        new MainMenu().show();

        Scanner inp = new Scanner(System.in);
        //while (true) {
            char res = inp.next(".").charAt(0);
            System.out.println(res);
            switch (res) {
                case '0':
                    new PlayersMenu().show();
                    break;
                case '1':
                    System.out.println("not implemented");
                    break;
                case '2':
                    System.out.println(" Bye bye...");
                    break;
                default :
                    System.out.println("Wrong input");
                    break;
            }
        //}
    }


}
