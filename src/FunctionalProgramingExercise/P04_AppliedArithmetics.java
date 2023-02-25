package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            switch (command){
                case "add":
                    numbers = numbers.stream().map(e -> e + 1).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(e -> e * 2).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(e -> e - 1).collect(Collectors.toList());
                    break;
                case "print":
                    numbers.stream().forEach(e -> System.out.print(e + " "));
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
