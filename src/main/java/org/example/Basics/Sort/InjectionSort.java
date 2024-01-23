package org.example.Basics.Sort;

public class InjectionSort {
    public static int[] insectionSort(int [] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i;
            while (j > 1 && array[j - i] >= temp){
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }
        return array;
    }
}
