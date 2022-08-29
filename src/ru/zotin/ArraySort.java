package ru.zotin;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};

        printArray(array);
    }

    public static int[] bubbleSort(int[] numbers) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = tmp;
                    isSorted = false;
                }
            }

        }
        return numbers;
    }

    public static int[] printArray(int[] arr) {
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        return arr;
    }

    static class ArrayTest {

        @org.junit.jupiter.api.Test
        void testSort() {
            int[] numbers = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
            int[] expectedResult = ArraySort.bubbleSort(numbers);
            int[] resultSort = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
            assertArrayEquals(resultSort, expectedResult);
        }

        @org.junit.jupiter.api.Test
        void testPrint() {
            int[] numbers = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
            int[] expectedResult = ArraySort.printArray(numbers);
            int[] resultPrint = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
            assertArrayEquals(resultPrint, expectedResult);
        }
    }
}
