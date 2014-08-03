package com.kr.models;

import java.util.Arrays;

/**
 * Created by kot on 03.08.14.
 */
public class Field {

    public static final int FIELD_SIZE = 8;

    private int[][] field;

    public Field()
    {
        this.field = new int[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                this.field[i][j] = 0;
            }
        }
        this.field[3][3] = this.field[4][4] = 1; //first player
        this.field[3][4] = this.field[4][3] = 2; //second player
    }

    public boolean set(int x, int y, int player)
    {
        return true;
    }

    public int[][] getField()
    {
        return this.field;
    }



}
