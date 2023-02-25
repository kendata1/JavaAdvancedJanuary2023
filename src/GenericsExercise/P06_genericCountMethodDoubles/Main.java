package src.GenericsExercise.P06_genericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Box<Double>> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double currentElement = Double.parseDouble(scanner.nextLine());
            Box<Double> box = new Box<>(currentElement);
            boxList.add(box);
        }
        Box<Double> elementToCompareWith = new Box<>(Double.parseDouble(scanner.nextLine()));

        int count = countGreaterThanElement(boxList, elementToCompareWith);
        System.out.println(count);

    }

    static <T extends Comparable<T>> int countGreaterThanElement(List<T> list, T element) {
        int count = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0)
                count++;
        }
        return count;
    }
}
