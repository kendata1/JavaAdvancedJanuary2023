package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededLength = Integer.parseInt(scanner.nextLine());

        Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length() <= neededLength).forEach(e -> System.out.println(e));
    }
}
