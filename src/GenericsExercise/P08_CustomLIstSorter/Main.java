package src.GenericsExercise.P08_CustomLIstSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            String element;
            int index;

            switch (command) {
                case "Add":
                    element = inputArr[1];
                    customList.add(element);
                    break;
                case "Remove":
                    index = Integer.parseInt(inputArr[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    element = inputArr[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    index = Integer.parseInt(inputArr[1]);
                    int indexTwo = Integer.parseInt(inputArr[2]);
                    customList.swap(index, indexTwo);
                    break;
                case "Greater":
                    element = inputArr[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    customList.sort();
                    break;
                case "Print":
                    customList.print();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}

