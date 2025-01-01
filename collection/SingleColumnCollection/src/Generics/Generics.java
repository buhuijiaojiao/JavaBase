package Generics;

import java.util.Arrays;

public class Generics<E> {
    Object[] objects=new Object[10];
    int size=0;
    public void add(E e){
        objects[size]=e;
        size++;
    }

    public E get(int index) {
        return (E)objects[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
