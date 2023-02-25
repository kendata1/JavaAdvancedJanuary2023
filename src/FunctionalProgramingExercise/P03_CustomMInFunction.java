package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.Scanner;


public class P03_CustomMInFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).min(Integer::compare).get();

        System.out.println(min);


    }
}
