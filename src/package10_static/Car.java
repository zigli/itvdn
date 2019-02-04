package package10_static;



public class Car {
    String model;
    String color;

    static double count;

    public static void main (String[] args){
        Car c1 = new Car();
        Car.count = 1;
        Car c2 = new Car();
        Car.count = 2;
        Car c99 = new Car();
        Car.count = 99;

        Car.doSomething();
        doSomething();
    }

    public static void doSomething(){
        System.out.println("Hello!");
    }
}
