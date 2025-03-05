import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.toString(numbers));

        int[] array = new int[10];
        int a = array[0];
        int a1 = array[9];
        int a2 = array[array.length - 1];

        int[] numbah = {27, 51, 33, -1, 101};
        System.out.println(numbah);


        double[] numbo = {4.5, 25.3, 12.1, 34.0, 15.5};
        for (int i = 0; i < numbo.length; i++) {
            System.out.println(Math.pow(numbo[i], 2));
        }

        for (int i = 0; i < numbo.length; i++) {
            System.out.println(Math.sqrt(numbo[i]));
        }


        for (int i = 0; i < numbo.length; i++) {
            if (numbo[i] == 34.0) {
                System.out.println("Value found at index at " + i);
            }
        }

        double maxValue = numbo[0];
        for (int i = 0; i < numbo.length; i++) {
            if (numbo[i] > numbo[0]) {
                maxValue = i;
            }

        }
        System.out.println("Maximum found at index  " + maxValue);

        int minValue = 0;
        for (int i = 0; i < numbo.length; i++) {
            if (numbo[i] < minValue) {
                minValue = i;
            }

        }
        System.out.println("minimum found at index  " + minValue);
        int[] array1 = {1011, 40, 58, 2040, 48};
        average(array1);

    }

    public static void average(int[] array1) {

        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
            sum /= array1.length;

        }
        System.out.println("average er " + sum);




    }

    public static void arrayo(String[] args) {
        // opgave a



    }
}