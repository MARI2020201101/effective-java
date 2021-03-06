package ch05.item29;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size;
    private int max;
    private static final int DEFAULT_SIZE = 16;


    public Stack(){
        elements = new Object[DEFAULT_SIZE];
    }
    public Stack(int capacity){
        max=capacity;
        elements=new Object[max];
        size=0;
    }
    public void push(Object o){
        if(size>=max) ensureCapacity();
        elements[size++] = o;
    }

    public Object pop(){
        if(isEmpty()) return null;

        Object o = elements[--size];
        elements[size]=null;
        return o;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void ensureCapacity(){
        if(max==size)
            elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
