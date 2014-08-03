package com.kr.models;

/**
 * Created by kot on 03.08.14.
 */
public class Player {

    private int index; //player index 1 (black), 2 (white)

    private String name;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getIndex()
    {
        return this.index;
    }

}
