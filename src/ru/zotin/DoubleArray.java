package ru.zotin;

public class DoubleArray {
    public static void main(String[] args) throws InterruptedException {
        long[][] matrix = new long[5][5];
        long start = System.currentTimeMillis();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                 Thread.sleep(50);
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                matrix[i][j] = elapsed;
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("Максимальное число в массиве: " + getMaxValue(matrix));
        System.out.println("Минимальное число в массиве: " + getMinValue(matrix));
        System.out.println("Среднее арифметическое число в массиве: " + getMiddleValue(matrix));
    }

    public static long getMaxValue(long[][] numbers) {
        long maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }

        return maxValue;
    }

    public static long getMinValue(long[][] numbers) {
        long minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];
                }
            }
        }

        return  minValue;
    }

    public static double getMiddleValue(long[][] numbers) {
        long sum = 0;
        int indexCounter = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                sum += numbers[i][j];
                indexCounter++;
            }
        }

        return (double) (sum / indexCounter);
    }

}

