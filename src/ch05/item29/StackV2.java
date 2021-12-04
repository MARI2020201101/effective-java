package ch05.item29;

import java.util.Arrays;

public class StackV2<E> {
    private E[] elements;
    private int size;
    private int max;
    private static final int DEFAULT_SIZE = 16;


    public StackV2(){
        elements = (E[])new Object[DEFAULT_SIZE]; //Ex타입으로 캐스팅..
    }
    public StackV2(int capacity){
        max=capacity;
        elements=(E[])new Object[max];
        size=0;
    }
    public void push(E o){
        if(size>=max) ensureCapacity();
        elements[size++] = o;
    }

    public E pop(){
        if(isEmpty()) return null;

        E o = elements[--size];
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
