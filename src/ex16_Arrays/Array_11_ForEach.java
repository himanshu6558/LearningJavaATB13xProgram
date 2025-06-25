package ex16_Arrays;

import java.util.Scanner;

public class Array_11_ForEach {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter "+length+ " numbers");
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printed Array");
        for(int i:arr){
            System.out.println(i);
        }
    }
}
