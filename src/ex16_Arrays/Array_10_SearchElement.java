package ex16_Arrays;

import java.util.Scanner;

public class Array_10_SearchElement {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter "+length+ " numbers");
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element need to be searched");
        int searchElement = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(searchElement == arr[i]){
                System.out.println("Element found at "+i+ " position");
                break;
            }
        }
        System.out.println("Element not found");
    }
}
