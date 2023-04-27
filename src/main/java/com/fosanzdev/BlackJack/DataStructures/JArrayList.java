package com.fosanzdev.BlackJack.DataStructures;

import com.fosanzdev.BlackJack.Players.Jugador;
import com.fosanzdev.BlackJack.Players.Strategies.Strategy;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Clase que implementa un ArrayList propio
 * @param <T> Tipo de dato que va a contener el ArrayList
 */
public class JArrayList<T> implements Iterable<T>{

    // Atributos
    private static final int DEFAULT_SIZE = 10; // Tamaño por defecto
    private static final double INCREMENT_FACTOR = 1.5; // Factor de incremento

    private T[] array = (T[]) new Object[DEFAULT_SIZE]; // Array de elementos

    private int count = 0; // Contador de elementos

    // Constructores

    //Constructor por defecto
    public JArrayList() {
    }

    // Constructor con un array de elementos Jugador
    public JArrayList(Jugador... jugadores) {
        for (int i = 0; i < jugadores.length; i++) {
            add((T) jugadores[i]);
        }
    }

    // Constructor con un array de elementos Strategy
    public JArrayList(Strategy... strategies){
        for (int i = 0; i < strategies.length; i++) {
            add((T) strategies[i]);
        }
    }

    /**
     * Añade un elemento al final del array
     * @param value Elemento a añadir
     */
    public void add(T value) {
        if (count == array.length) {
            array = resize();
        }
        array[count] = value;
        count++;
    }

    /**
     * Obtiene un elemento dado un indice
     * @param index Indice del elemento
     * @return Elemento del array
     */
    public T get(int index) {
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    /**
     * Elimina un elemento del array dado un indice
     * El elemento eliminado es sustituido por el ultimo elemento del array
     * @param index Indice del elemento a eliminar
     */
    public void del(int index) {
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = array[count - 1];
        count--;
    }

    /**
     * Retorna el tamaño del array
     * @return Tamaño del array
     */
    public int size() {
        return count;
    }

    /**
     * Redimensiona el array con el factor de incremento
     * @return Array redimensionado
     */
    private T[] resize() {
        T[] newArray = (T[]) new Object[(int) (array.length * INCREMENT_FACTOR)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    /**
     * Limpia el array
     */
    public void clear() {
        array = (T[]) new Object[DEFAULT_SIZE];
        count = 0;
    }

    /**
     * Comprueba si el array esta vacio
     * @return True si esta vacio, false si no
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Comprueba si el array contiene un elemento
     * @param value Elemento a comprobar
     * @return True si lo contiene, false si no
     */
    public boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve el indice de un elemento
     * @param value Elemento a buscar
     * @return Indice del elemento
     */
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

    // Metodos por defecto de la interfaz Iterable
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

    /**
     * Metodo toString para imprimir el array
     * @return String con el array
     */
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
