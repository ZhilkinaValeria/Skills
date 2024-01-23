package org.example.Basics.Sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array1) {
        int[] sortArr = Arrays.copyOf(array1, array1.length); //массив для сортировки
        int[] bufferArr = new int[array1.length];
        return recurtoinMergeSort(sortArr, bufferArr, 0, array1.length);
    }

    public static int[] recurtoinMergeSort(int[] sortArr, int[] bufferArr, int startIndex, int endIndex) {
        //выход из массива, когда в рассматриваемом промежутке только 1 элемент
        if (startIndex >= endIndex - 1) return sortArr;
        //запускаем рекурсию, чтобы получить 2 отсортированных массива
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] firstSortArr = recurtoinMergeSort(sortArr, bufferArr, startIndex, middle);
        int[] secondSortArr = recurtoinMergeSort(sortArr, bufferArr, middle, endIndex);
        // слияние отсортированного массива
        int firstIndex = startIndex;
        int secondIndex = middle;
        int destIndex = startIndex;
        int[] result = firstSortArr == sortArr ? bufferArr : sortArr;
        while (firstIndex < middle && secondIndex < endIndex) {
            result[destIndex++] = firstSortArr[firstIndex] < secondSortArr[secondIndex] ? firstSortArr[firstIndex++] : secondSortArr[secondIndex++];
        }
        while (firstIndex < middle) {
            result[destIndex++] = firstSortArr[firstIndex++];
        }
        while (secondIndex < endIndex) {
            result[destIndex++] = secondSortArr[secondIndex++];
        }
        return result;
    }
}