package src.GenericsExercise.P05_GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List <Box<String>> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentElement = scanner.nextLine();
            Box<String> box = new Box<>(currentElement);
            boxList.add(box);
        }
        Box <String> elementToCompareWith = new Box<>(scanner.nextLine());

        int count = countGreaterThanElement(boxList,elementToCompareWith);
        System.out.println(count);

    }
    static <T extends Comparable <T>> int countGreaterThanElement (List<T> list, T element) {
        int count = 0;
        for (T t : list) {
            if(t.compareTo(element) > 0)
                count++;
        }
    return count;
    }
}
