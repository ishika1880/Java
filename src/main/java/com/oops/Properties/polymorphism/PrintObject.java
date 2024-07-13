package com.oops.Properties.polymorphism;

public class PrintObject {

    //printing the object

    int num;
   public PrintObject(int num){
    this.num = num;
   }

   // this will override the inbuild tostring method to print the object 
   @Override
   public String toString(){
    return "PrintObject{" + "num="+num + "}";
   }

   public static void main(String[] args) {
    PrintObject obj = new PrintObject(30);

    System.out.println(obj);
   }

}
