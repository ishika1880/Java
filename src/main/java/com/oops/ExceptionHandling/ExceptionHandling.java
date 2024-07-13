package com.oops.ExceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;

        // this will try the expressions written in this block 
        // only process only one exception
        try{
           // divide(a,b);

            String name = "hi";
            if(name.equals("hi")){
                throw new MyException("name can't be hi");
            }
        } 
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        // this will catch only Arithmetic Exception the exceptions in the try block
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        // this catch all exceptions 
        // this Exception you can't write before ArithmeticException exception 
        // as Exception already cover all types of exception
        catch(Exception e){
            System.out.println("exception");
        }
        // Anyhow this will execute
        finally {
            System.out.println("anyways this will execute");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("denominator is zero");
        }
        return a/b;
    }

}
