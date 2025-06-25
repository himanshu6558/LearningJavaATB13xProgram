package ex16_Arrays;

import java.util.Arrays;

public class Array_12_CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] duplicate = new int[arr1.length];

        System.arraycopy(arr1,0,duplicate,0,arr1.length);

        System.out.println("First method");
        for (int i = 0; i < duplicate.length; i++) {
            System.out.println(duplicate[i]);
        }

        System.out.println("Second method");
        int[] duplicate1 = Arrays.copyOf(arr1,arr1.length);
        for (int i = 0; i < duplicate1.length; i++) {
            System.out.println(duplicate1[i]);
        }

        System.out.println("Third method");

        int[] duplicate2 = arr1.clone();
        for (int i = 0; i < duplicate2.length; i++) {
            System.out.println(duplicate2[i]);
        }

        System.out.println("Fourth method");

        int[] duplicate3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            duplicate3[i] = arr1[i];
            System.out.println(duplicate3[i]);
        }
    }
}
