package LiveTest.JavaString;

public class Challenge1_and_2 {
    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println("Length: "+s.length());
        System.out.println("First char: "+s.charAt(0));
        System.out.println("Substring: "+s.substring(6));

        String String1 = "Hello";
        String String2 = "hello";
        String String3 = "Hello";

        System.out.println(String1.equals(String2));
        System.out.println(String1.equalsIgnoreCase(String2));
        System.out.println(String1.compareTo(String2));
    }
}
