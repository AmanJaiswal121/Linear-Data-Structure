package Array;

import java.util.*;

public class cyclicRotation {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int size = r.nextInt();
        int arr[] = new int[size];
        System.out.println("Elements of array are :");

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }

        int rotate = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = rotate;
        System.out.println(Arrays.toString(arr));
    }
}
