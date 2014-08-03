package com.kr.models;

/**
 * Created by kot on 03.08.14.
 */
public class Player {

    private int index; //player index 1 (black), 2 (white)

    private int score;

    private String name;

    public Player(int index, String name)
    {
        this.index = index;
        this.name = name;
        this.score = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public int getIndex()
    {
        return this.index;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return this.score;
    }
}
