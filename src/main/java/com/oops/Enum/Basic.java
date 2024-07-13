package com.oops.Enum;

// Java Enums are used when we know all possible values at compile time, 
// such as weeks, months etc

public class Basic {
    enum months implements A{
        January, February, March, April, May, June, July, August, September, October, November, December;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is months

        void display() {

        }

        months(){
            System.out.println("constructor called for "+this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final months month = new months();
    }

    public static void main(String[] args) {
        months month;
        month = months.February;
        month.hello();
        System.out.println(months.valueOf("February"));
//        for(months day : months.values()) {
//            System.out.println(day);
//        }

//        System.out.println(month.ordinal());
    }
}
