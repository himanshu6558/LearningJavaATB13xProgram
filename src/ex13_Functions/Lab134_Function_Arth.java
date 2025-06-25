package ex13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        System.out.println("Enter two digits");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        if(scanner.hasNextInt()){
            a=scanner.nextInt();
        }
        else {
            throw new IllegalArgumentException("Please enter integer only.");
        }
        int b = 0;
        if(scanner.hasNextInt()){
            b=scanner.nextInt();
        }
        else {
            throw new IllegalArgumentException("Please enter integer only.");
        }

        System.out.println("Add :" + add(a, b));
        System.out.println("Sub :" + sub(a, b));
        System.out.println("Mul :" + mul(a, b));
        System.out.println("Div :" + div(a, b));
        System.out.println("Mod :" + mod(a, b));
    }

    static int add(int a, int b) {
        return (a + b);
    }

    static int sub(int a, int b) {
        return (a - b);
    }

    static int mul(int a, int b) {
        return (a * b);
    }

    static int div(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return (a / b);
    }

    static int mod(int a, int b) {
        return (a % b);
    }
}
