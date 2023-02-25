package src.GenericsLAB.P02_GenericsArrayCreator;

public class Main {
    public static void main(String[] args) {
        ArrayCreator <Integer> arrayCreator = new ArrayCreator<Integer>();

        Integer[] integers = arrayCreator.create(Integer.class,5,5);

        System.out.println();
    }
}
