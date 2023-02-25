package src.DefiningClassesExercise.P01_OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] inputArr = scanner.nextLine().split(" ");

            String name = inputArr[0];
            int age = Integer.parseInt(inputArr [1]);

            Person person = new Person(name, age);
            personList.add(person);
        }
        personList.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(e -> e.getName())).forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));
    }
}
