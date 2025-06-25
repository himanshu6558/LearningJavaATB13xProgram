package ex16_Arrays;

import java.util.Scanner;

public class Arrays_06_Sum {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter "+length+ " numbers");
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println("Sum of array is: "+sum);
    }
}
