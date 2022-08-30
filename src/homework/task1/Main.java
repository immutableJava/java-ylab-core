package homework.task1;

public class Main {
    public static void main(String[] args) {
        int[] ints = {2, 5, 1, 6, 4, 5, 2, 8};
        double[] testArr = returnMaxMinAvgValues(ints);
        test((int) testArr[0] == 8);
        test((int) testArr[1] == 1);
        test(testArr[2] == 4.125);
    }

    public static double[] returnMaxMinAvgValues(int[] ints) {
        double[] result = new double[3];
        int min = ints[0];
        int max = ints[0];
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        double avg = 0;
        for (int i : ints) {
            avg += i;
        }
        avg = avg / ints.length;
        result[0] = max;
        result[1] = min;
        result[2] = avg;
        System.out.println("Максимальное значение - " + max);
        System.out.println("Минимальное значение - " + min);
        System.out.println("Среднее значение - " + avg);
        return result;
    }

    public static void test(boolean flag) {
        if (!flag) {
            throw new RuntimeException("Тест провален.");
        } else {
            System.out.println("Тест пройден.");
        }
    }
}
