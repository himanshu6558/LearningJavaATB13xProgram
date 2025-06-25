package ex16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_07_Sort {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter "+length+ " numbers");
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Sort
        System.out.println("Sorted Array");

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
