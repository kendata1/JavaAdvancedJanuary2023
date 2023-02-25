package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> newLine = e -> System.out.println(e);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(e -> newLine.accept(e));
    }
}
