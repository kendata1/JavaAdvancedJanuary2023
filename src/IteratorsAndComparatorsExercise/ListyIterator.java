package src.IteratorsAndComparatorsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ListyIterator<T> implements Iterable<T> {
    ArrayList<T> list;

    public ListyIterator(T... elements) {
        this.list = new ArrayList<>(Arrays.asList(elements));
    }
    ListIterator listIterator = new ListIterator();

    public boolean move() {
        boolean isMoved = false;
        if (iterator().hasNext()) {
            iterator().next();
            isMoved = true;
        }
        return isMoved;
    }

    public void print () {
        if (listIterator.index >= list.size()){
            throw new RuntimeException("Invalid Operation!");
        } else {
            System.out.println(list.get(listIterator.index));
        }
    }
    public boolean hasNext () {
        return iterator().hasNext();
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            index ++;
            return list.get(index);
        }
    }
}
