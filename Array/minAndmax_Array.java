package Array;

import java.util.Arrays;

public class minAndmax_Array {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 8, 9, 10 };
        System.out.println("Original array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Maximum no is - "+ arr[6]);
        System.out.println("Minimum no is - "+ arr[0]);
    }
}
