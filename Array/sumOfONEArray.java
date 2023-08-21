package Array;

import java.util.Scanner;

public class sumOfONEArray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = r.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of array :");
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
            for (int j = 1; j < size; j++) {
                if (arr[i] + arr[j] == 9) {
                    System.out.println(arr[i] + "," + arr[j]);
                    break;
                }
            }
        }
    }
}
