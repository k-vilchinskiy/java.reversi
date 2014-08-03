package com.kr.view;

/**
 * Created by kot on 03.08.14.
 */
public class MainMenu {

    private static final String[] menuItems = {
            "New Game (0)",
            "Settings (1)",
            "Exit     (2)"
    };

    public void show()
    {
        System.out.println(" Main Menu:");
        System.out.println("New Game (0)");
        System.out.println("Settings (1)");
        System.out.println("Exit     (2)");
    }

}
