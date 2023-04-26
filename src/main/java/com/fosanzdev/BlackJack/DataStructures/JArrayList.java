package com.fosanzdev.BlackJack.DataStructures;

public class JArrayList<T> {

    private static final int DEFAULT_SIZE = 10;
    private static final double INCREMENT_FACTOR = 1.5;

    private T[] array = (T[]) new Object[DEFAULT_SIZE];

    private int count = 0;

    public void add(T value) {
        if (count == array.length) {
            array = resize();
        }
        array[count] = value;
        count++;
    }

    public T get(int index) {
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void del(int index) {
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = array[count - 1];
        count--;
    }

    public int size() {
        return count;
    }

    private T[] resize() {
        T[] newArray = (T[]) new Object[(int) (array.length * INCREMENT_FACTOR)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public void clear() {
        array = (T[]) new Object[DEFAULT_SIZE];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T value) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
