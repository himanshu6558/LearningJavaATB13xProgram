package ex16_Arrays;

import java.util.Scanner;

public class Arrays_05_Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter "+length+ " numbers");
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Reverse
        System.out.println("Reverse of Array");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
