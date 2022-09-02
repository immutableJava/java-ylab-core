package homework.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        returnMaxMinAvgValues(ints);
    }

    public static void returnMaxMinAvgValues(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                ints[i][j] = (int) (Math.random() * Integer.MAX_VALUE);
            }
        }
        System.out.println("Массив: " + Arrays.deepToString(ints));
        int max = ints[0][0];
        for (int[] anInt : ints) {
            for (int j = 0; j < ints[0].length; j++) {
                if (anInt[j] > max) {
                    max = anInt[j];
                }
            }
        }
        int min = ints[0][0];
        for (int[] anInt : ints) {
            for (int j = 0; j < ints[0].length; j++) {
                if (anInt[j] < min) {
                    min = anInt[j];
                }
            }
        }

        double avg = 0;
        for (int[] anInt : ints) {
            for (int j = 0; j < ints[0].length; j++) {

                avg += anInt[j];

            }
        }
        avg = avg / (ints.length * ints[0].length);
        System.out.println("Максимальное значение - " + max);
        System.out.println("Минимальное значение - " + min);
        System.out.println("Среднее значение - " + avg);
    }
}
