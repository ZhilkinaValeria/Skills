package org.example.Basics.MaxMinMiddle;

public class MinMaxMiddle {
    public static String minMaxMiddle(int [] array){
        int max = array[0];
        int min = array[0];
        int avr = 0;
        for (int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avr += array[i] / array.length;
        }
        String result = String.format("max = %s, min = %s, avr = %s", max, min, avr);
        return result;
    }
}
