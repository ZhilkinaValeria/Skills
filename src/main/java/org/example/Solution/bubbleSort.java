package org.example.Solution;

public class bubbleSort {
    public static int[] bubleSort(int[] array) { //медленная, т.к. имеет вложенные циклы
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) { //Сравниваем 2 числа
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; // Если число слева больше, то поменять местами
                }
            }
        }
        return array;// Возвращает отсортированный массив
    }
}
