import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        //a
        int[] arr1 = {9, 5, 1, 8, 3, 2, 7, 4, 6};
        System.out.println(Arrays.toString(arr1));
        //b
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        //c
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
