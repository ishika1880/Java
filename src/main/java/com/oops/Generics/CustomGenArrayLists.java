package com.oops.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayLists<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomGenArrayLists() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T remove = (T) (data[--size]);
        return remove;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomGenArrayLists list = new CustomGenArrayLists();

        CustomGenArrayLists<Integer> list3 = new CustomGenArrayLists<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);

    }

}
 