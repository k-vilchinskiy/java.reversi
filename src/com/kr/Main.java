package com.kr;

import com.kr.controllers.Menu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            new Menu().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
