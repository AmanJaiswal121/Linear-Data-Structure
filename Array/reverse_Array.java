package Array;

import java.util.*;

public class reverse_Array {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of the arrya :");
        int a = r.nextInt();
        int arr[] = new int[a];
        System.out.println("Original array - ");
        for (int i = 0; i < a; i++) {
            arr[i] = r.nextInt();
        }
        System.out.println();
        System.out.println("Reverse array - ");

        for (int i = a - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
