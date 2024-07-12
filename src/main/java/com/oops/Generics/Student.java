package com.oops.Generics;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {

    private int physics_marks;
    private int maths_marks;

    

    public Student(int physics_marks, int maths_marks) {
        this.physics_marks = physics_marks;
        this.maths_marks = maths_marks;
    }

    @Override
    public String toString(){
        return maths_marks+ "";
    }
    @Override
    public int compareTo(Student arg0) {

        System.out.println("maths marks");
        int result = (int)(this.maths_marks - arg0.maths_marks);
        return result;
 
        
    }
    public static void main(String[] args) {
        Student A = new Student(30, 50);
        Student B = new Student(20, 90);
        Student C = new Student(10, 80);
        Student D = new Student(70, 70);
        Student E = new Student(80, 10);
        Student H = new Student(40, 20);
        Student G = new Student(50, 300);

        Student[] list = {A, B, C, D, E, H, G};

       
        System.out.println(Arrays.toString(list));
         //it will call the compareto method 
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        // descending order
        // Arrays.sort(list, new Comparator<Student>() {
            
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return -(int)(o1.maths_marks - o2.maths_marks);
        //     }
        // });
        // System.out.println(Arrays.toString(list));

        // converting the above functio to one line
        // accending order
        // Arrays.sort(list, (o1, o2) -> (int)(o1.maths_marks - o2.maths_marks));
        // System.out.println(Arrays.toString(list));
    }

}
