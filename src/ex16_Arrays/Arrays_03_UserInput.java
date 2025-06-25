package ex16_Arrays;

import java.util.Scanner;

public class Arrays_03_UserInput {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("Enter "+length+ " numbers");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input numbers are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
