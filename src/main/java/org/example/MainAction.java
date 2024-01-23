package org.example;

import java.util.*;

import static java.lang.System.out;
import static org.example.Basics.MaxMinMiddle.MinMaxMiddle.minMaxMiddle;
import static org.example.Basics.Sort.FastSort.fastSort;
import static org.example.Basics.Sort.InjectionSort.insectionSort;
import static org.example.Basics.Sort.MergeSort.mergeSort;
import static org.example.Basics.Sort.SortBySelect.sortBySelect;
import static org.example.Basics.Sort.SortBySelect2.sortBySelect2;
import static org.example.Basics.Sort.BubbleSort.bubleSort;

public class MainAction {
    public static void main(String[] args) {
        //Зополнить массив можно 2 вариантами - заполнение с консоли или методом Math.random(), оба реализованы в коде


        /* Scanner input = new Scanner(System.in); // Объявляем Scanner
        out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int [] testArr = new int[size]; // Создаём массив int размером в size, вводим числа через пробел без запятых
        out.println("Insert array elements:");
        //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            testArr[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            out.print (" " + testArr[i]); // Выводим на экран, полученный массив
        }
        out.println(); */
        int n = 100;
        int [] testArr = new int[n];
        for (int i = 0; i < testArr.length; i++)
            testArr[i] = (int) (Math.random() * 100);

        out.println(Arrays.toString(bubleSort(testArr)));
        out.println(Arrays.toString(sortBySelect(testArr)));
        out.println(Arrays.toString(insectionSort(testArr)));
        out.println(Arrays.toString(sortBySelect2(testArr)));
        out.println(Arrays.toString(fastSort(testArr)));
        out.println(Arrays.toString(mergeSort(testArr)));
        out.println(minMaxMiddle(testArr));
    }
}