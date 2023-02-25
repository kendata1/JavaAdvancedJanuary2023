package src.GenericsExercise.P07_CustomList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList <T extends Comparable> {
    List <T> list;


    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add (T element){
        this.list.add(element);
    }
    public T remove (int index) {
        return this.list.remove(index);
    }

    public boolean contains (T element){
        if (this.list.contains(element)){
            return true;
        } else {
            return false;
        }
    }
    public void swap (int firstElement, int secondElement){
        T elementToSave = list.get(firstElement);

        list.set(firstElement, list.get(secondElement));
        list.set(secondElement,elementToSave);

    }
    public int countGreaterThan (T element){
        int count = 0;

        for (T t : list) {
            if(t.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
    public T getMin () {
        List <T> sorted = new ArrayList<>(list.stream().sorted().collect(Collectors.toList()));
        return sorted.get(0);
    }
    public T getMax () {
        List <T> sorted = new ArrayList<>(list.stream().sorted().collect(Collectors.toList()));
        return sorted.get(sorted.size() - 1);
    }
    public void print () {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
