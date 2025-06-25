package ex16_Arrays;
import java.util.Scanner;

public class Arrays_08_Sort_01 {
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
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        for(int i:arr){
            System.out.println(i);
        }
    }
}
