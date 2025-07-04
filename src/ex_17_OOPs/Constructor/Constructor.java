package ex_17_OOPs.Constructor;

public class Constructor {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        new Vehicle(4);
    }
}

class Vehicle {

    Vehicle(){
        System.out.println("Default constructor is called");
    }
    Vehicle(int wheels){
        System.out.println("Parameterized constructor is called");
    }
}
