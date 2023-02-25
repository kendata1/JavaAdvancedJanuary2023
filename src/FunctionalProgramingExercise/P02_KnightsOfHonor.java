package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer <String> addSirAndPrint = e -> System.out.println("Sir " + e);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(e -> addSirAndPrint.accept(e));
    }
}
