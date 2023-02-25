package src.GenericsExercise.P05_GenericCountMethodStrings;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(element.getClass().getName()).append(": ").append(element);

        return sb.toString();
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.element.compareTo(o.element);
    }
}
