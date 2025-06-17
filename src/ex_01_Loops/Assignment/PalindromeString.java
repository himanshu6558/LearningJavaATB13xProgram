package ex_01_Loops.Assignment;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.next();
        String revname = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            revname = revname + name.charAt(i);
        }
        System.out.println("Original String: " + name);
        System.out.println("Reverse String: " + revname);
        if (name.matches(revname)) {
            System.out.println("Therefore, it's a palindrome string.");
        } else {
            System.out.println("Therefore, it's not a palindrome string.");
        }
    }
}
