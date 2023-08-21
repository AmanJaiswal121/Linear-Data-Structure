package Array;

import java.util.Arrays;
import java.util.Scanner;

public class positiveAndNegativeNo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size = r.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 0) {
                System.out.println("Positive no. " + arr[i]);
            } else {
                System.out.println("Negative no. " + arr[i]);
            }
        }
    }
}

