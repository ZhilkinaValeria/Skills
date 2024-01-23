package org.example.Basics.Sort;

public class SortBySelect2 {
    public static int[] sortBySelect2(int [] array){
        int length = array.length;
        int step = length / 2;
        while (step > 0){
            for (int numberOfGroup = 0; numberOfGroup < length - step; numberOfGroup ++){
                int j = numberOfGroup;
                while (j >= 0 && array[j]> array[j + step]){
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
                step = step / 2;
            }
        }
        return array;
    }
}
