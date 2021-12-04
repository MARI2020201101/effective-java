package ch05.item29;

import java.util.Arrays;

@SuppressWarnings("unchecked") //타입에러 경고를 막는다. 안전함을 확신할 수 있기때문이다
public class StackV3<E> {
    private E[] elements;
    private int size;
    private int max;
    private static final int DEFAULT_SIZE = 16;


    public StackV3(){
        elements = (E[])new Object[DEFAULT_SIZE];
    }
    public StackV3(int capacity){
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
