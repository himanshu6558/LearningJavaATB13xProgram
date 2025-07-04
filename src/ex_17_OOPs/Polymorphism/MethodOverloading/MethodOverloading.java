package ex_17_OOPs.Polymorphism.MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,4));
        System.out.println(calculator.add(3,5,6));
        System.out.println(calculator.add(3.4,5.4));
    }
}
