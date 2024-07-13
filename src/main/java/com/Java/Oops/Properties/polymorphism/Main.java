package com.Java.Oops.Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        // overriding depends on object, static doesn't depend on object therefore static can't be overrided
        // overloading and overriding doesn't apply to instance variables
        Shapes shapes = new Shapes(); // which method will be called depends on Shapes, this is called upcasting
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        shapes.info();
        circle.info();
        triangle.info();
        square.info();
        // can be accessed by all these ways
       square.area(4);
        Shapes.area(3);
        shapes.area(3);
        
    }

}
/* Dynamic Polymorphism = method overriding
 * 
 * how java do upcasting - by dynamic memory dispatch, upcasting happens at the run time, left side of stament execute at the run time 
early binding : method call takes place at the compile time, so final methods can't be override
for all static, private and final methods
final void area(){
System.out.println("i am in shapes");
}
 */