package ch05.item31;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@SuppressWarnings("unchecked")
public class Stack<E> {
    private E[] elements;
    private int size;
    private int max;
    private static final int DEFAULT_SIZE = 16;


    public Stack(){
        elements = (E[])new Object[DEFAULT_SIZE];
    }
    public Stack(int capacity){
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

    public void pushAll(Iterable<? extends E> src){
        for(E e : src){
            elements[size++] = Objects.requireNonNull(e);
        }
    }
    public void popAll(Collection<? super E> dst){
        if(dst == null) throw new IllegalArgumentException("비어있음");
//        dst.addAll(Arrays.asList(elements));
//        for(E e : elements){
//            if(e!=null) dst.add(e);
//        }
        while(!isEmpty()){
            dst.add(pop());
        }
    }
}
