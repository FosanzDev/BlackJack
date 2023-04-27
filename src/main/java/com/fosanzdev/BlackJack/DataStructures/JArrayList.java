package com.fosanzdev.BlackJack.DataStructures;

import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.JugadorHumano;
import com.fosanzdev.BlackJack.Players.JugadorIA;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class JArrayList<T> implements Iterable<T>{

    private static final int DEFAULT_SIZE = 10;
    private static final double INCREMENT_FACTOR = 1.5;

    private T[] array = (T[]) new Object[DEFAULT_SIZE];

    private int count = 0;

    public JArrayList(Jugador... jugadores) {
        for (int i = 0; i < jugadores.length; i++) {
            add((T) jugadores[i]);
        }
    }

    public JArrayList(Strategy... strategies){
        for (int i = 0; i < strategies.length; i++) {
            add((T) strategies[i]);
        }
    }

    public JArrayList() {
    }

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

    /**
     * Iterador de la clase JArrayList. Necesario para poder usar el foreach
     * @return Iterador
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            // Checkea si hay un elemento siguiente
            @Override
            public boolean hasNext() {
                return index < count;
            }

            // Devuelve el elemento siguiente
            @Override
            public T next() {
                return array[index++];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    public T getRandom() {
        return array[(int) (Math.random() * count)];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        try{
            for (T t : array) {
                sb.append(t.toString()).append("\n");
            }
        } catch (NullPointerException e) {
            sb.append("null");
        }
        return sb.toString();
    }
}
