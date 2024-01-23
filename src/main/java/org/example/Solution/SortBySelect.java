package org.example.Solution;

public class SortBySelect {
    public static int[] sortBySelect(int [] array){ // Последовательный перебор всех чисел и выбор меньшего эл., кот.меняют местами с крайним эл слева9 0 эл)
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array [min] = temp;
        }
        return array; // Возвращает отсортированный массив
    }
}
