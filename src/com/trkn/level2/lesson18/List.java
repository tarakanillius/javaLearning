package com.trkn.level2.lesson18;

import java.util.Iterator;

public class List<T> implements Iterable<T>{
    private final T[] objects;
    private int size;

    public List(int size) {
        this.objects = (T[])new Object[size];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public int getSize() {
        return size;
    }

    public T get(int index) {
        return objects[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return objects[index++];
        }
    }
}
