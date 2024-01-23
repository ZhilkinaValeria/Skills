package org.example;


import java.util.Arrays;

import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) {
       int [] testArr = new int[] {6, 10, 8, 9, 7, 5, 2, 8, 16, 3};
       out.println(Arrays.toString(bubleSort(testArr)));
       out.println(Arrays.toString(sortBySelect(testArr)));
       out.println(Arrays.toString(insectoinSort(testArr)));
       out.println(Arrays.toString(sortBySeleect(testArr)));


    }
    // сортруем наш массив в порядке возрастания методом пузырьковой сортировки
    public static int[] bubleSort(int[] array){ //медленная, т.к. имеет вложенные циклы
        for (int i = array.length - 1; i > 1; i --){
            for (int j = 0; j < i; j ++){
                if (array[j] > array[j + 1]){ //Сравниваем 2 числа
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; // Если число слева больше, то поменять местами
                }
            }
        }
        return array; // Возвращает отсортированный массив
    }
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
    public static int[] insectoinSort(int [] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - i] >= temp){
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }
        return array;
    }
    public static int[] sortBySeleect(int [] array){
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