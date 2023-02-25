package src.GenericsExercise.P04_GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Box> boxList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = null;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            box = new Box<>(number);
            boxList.add(box);
        }
        String [] swapCommand = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(swapCommand[0]);
        int secondIndex = Integer.parseInt(swapCommand[1]);

        swap(boxList,firstIndex,secondIndex);

        boxList.stream().forEach(e -> System.out.println(e));
    }
    static <T> void swap(List<T> list, int firstIndex, int secondIndex) {
        T elementToSave = list.get(firstIndex);

        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, elementToSave);
    }
}
