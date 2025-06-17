package ex_01_SwithStatement;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ch = 0;
        if (a == b && b == c) {
            ch = 1;
        } else if (a == b || a == c || b == c) {
            ch = 2;
        }

        switch (ch) {
            case 1:
                System.out.println("Equilateral Triangle");
                break;
            case 2:
                System.out.println("Isosceles Triangle");
                break;
            default:
                System.out.println("Scalene triangle");
        }
    }
}
