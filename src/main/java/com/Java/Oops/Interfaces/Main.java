package com.Java.Oops.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.brake();
        car.start();
        car.stop();

        NewCar newCar = new NewCar();

        newCar.start();
        newCar.startMusic();
        newCar.brake();

        B obj = new B();
        System.out.println(obj.isOdd(10));
    }
    // infrace don't care whether 2 classes are realted or not 

    // Engine car = new Car();
    // car.a - we can't access it because the variable access is defined by the Engine here
    // interface can also inherited
    //static interface method should always have a body
    // methods that are overridden should can change the access specifier but should delare less restricted compared to the previous one 
    //in nested interface the super interface should be public 
}
