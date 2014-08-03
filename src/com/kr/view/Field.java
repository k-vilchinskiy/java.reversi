package com.kr.view;

/**
 * Created by kot on 03.08.14.
 */
public class Field {

    private static final char[] chars = {
            '_',
            '*',
            'o'
    };

    public void show(com.kr.models.Field field)
    {

        for (int i = 0; i < field.FIELD_SIZE; i++) {
            System.out.print(" _");
        }
        System.out.println();
        for (int i = 0; i < field.FIELD_SIZE; i++) {
            for (int j = 0; j < field.FIELD_SIZE; j++) {
                System.out.print('|');
                System.out.print(chars[field.getField()[i][j]]);
            }
            System.out.println('|');
        }
    }

}
