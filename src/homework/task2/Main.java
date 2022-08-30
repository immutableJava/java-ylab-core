package homework.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {5, 6, 3, 2, 5, 1, 4, 9};
        bubbleSort(ints);
        test(Arrays.equals(ints, new int[]{1, 2, 3, 4, 5, 5, 6, 9}));
    }

    public static void bubbleSort(int[] ints) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void test(boolean flag) {
        if (!flag) {
            throw new RuntimeException("Тест провален.");
        } else {
            System.out.println("Тест пройден.");
        }
    }
}
