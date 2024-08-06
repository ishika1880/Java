package com.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DefaultSize = 10;

    int ptr = -1;

    public CustomStack(){
        this(DefaultSize);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFUll() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {

        return ptr == -1;
    }
    
    public boolean push(int item){
        if(isFUll()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }


    // public int pop() throws StackException{
    //     if(isEmpty()){
    //         throw new StackException("Cann't pop from an empty stack!");
    //     }

    //     return data[ptr--];
    // }

    public void pop() {
        ptr--;

        int[] temp = new int[data.length];

        for(int i =0; i<=ptr; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public int getMin() {
        int min = data[0];
        for(int i = 1; i<=ptr; i++){
            if(min>data[i]){
                min = data[i];
            }
        }
        return min;
    }

}
