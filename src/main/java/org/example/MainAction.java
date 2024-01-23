package org.example;


import java.util.Arrays;

import static java.lang.System.out;
import static org.example.Solution.InsectionSort.insectionSort;
import static org.example.Solution.SortBySelect.sortBySelect;
import static org.example.Solution.SortBySelect2.sortBySelect2;
import static org.example.Solution.bubbleSort.bubleSort;

public class MainAction {
    public static void main(String[] args) {
       int [] testArr = new int[] {6, 10, 8, 9, 7, 5, 2, 8, 16, 3};
       out.println(Arrays.toString(bubleSort(testArr)));
       out.println(Arrays.toString(sortBySelect(testArr)));
       out.println(Arrays.toString(insectionSort(testArr)));
       out.println(Arrays.toString(sortBySelect2(testArr)));
    }
}