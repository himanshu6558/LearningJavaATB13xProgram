package ex_17_OOPs.Polymorphism.MethodOverriding;

public class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Bhau bhau...");
    }
    Dog(){
        System.out.println("This is dog");
    }
}
