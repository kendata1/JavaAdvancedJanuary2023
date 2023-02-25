package src.FunctionalProgramingLAB;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map <String, Integer> peopleMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] inputArr = scanner.nextLine().split(", ");
            peopleMap.put(inputArr[0],Integer.parseInt(inputArr[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = filterByCondition(condition, age);
        Consumer<Map.Entry<String, Integer>> print = getPrintConsumer(format);


        peopleMap
                .entrySet()
                .stream()
                .filter(e -> filter.test(e.getValue()))
                .forEach(e -> print.accept(e));
    }

    private static Consumer <Map.Entry<String, Integer>> getPrintConsumer(String format) {
        switch (format) {
            case "name":
                return e -> System.out.println(e.getKey());

            case "age":
                return e -> System.out.println(e.getValue());

            case "name age":
                return e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());

        }
        throw new RuntimeException("Bad format!");
    }

    static Predicate <Integer> filterByCondition (String condition, int age) {
        if (condition.equals("younger")){
            return e -> e <= age;
        } else {
            return e -> e >= age;
        }
    }
}
