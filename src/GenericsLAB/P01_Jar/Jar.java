package src.GenericsLAB.P01_Jar;

import java.util.ArrayDeque;

public class Jar <T> {

    private ArrayDeque <T> storage;

    public Jar(ArrayDeque<T> storage) {
        this.storage = new ArrayDeque<T>();
    }

    public void add (T element){
        this.storage.push(element);
    }

    public T remove () {
        return this.storage.pop();
    }
}
