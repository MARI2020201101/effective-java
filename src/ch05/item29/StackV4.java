package ch05.item29;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class StackV4<E> {
    private Object[] elements;
    private int size;
    private int max;
    private static final int DEFAULT_SIZE = 16;


    public StackV4(){
        elements = new Object[DEFAULT_SIZE];
    }
    public StackV4(int capacity){
        max=capacity;
        elements=new Object[max];
        size=0;
    }
    public void push(E o){
        if(size>=max) ensureCapacity();
        elements[size++] = o;
    }

    public E pop(){
        if(isEmpty()) return null;

        E o = (E) elements[--size];
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
