package ex_17_OOPs.Constructor;

public class Constructor1 {
    public static void main(String[] args) {
        Car punch = new Car(4,5,"2022");
        Car hilux = new Car(8,3,"2015");

        System.out.println(punch.wheels);
        System.out.println(hilux.model);

    }

    public static class Car {
        int wheels;
        int capacity;
        String model;

        Car(int wheels, int capacity, String model){
            this.wheels = wheels;
            this.capacity = capacity;
            this.model = model;
        }
    }
}
