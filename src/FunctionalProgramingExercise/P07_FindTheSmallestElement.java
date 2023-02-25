package src.FunctionalProgramingExercise;

import java.util.Scanner;
import java.util.function.Function;

public class P07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function <int [], Integer> getTheSmallest = e -> {
            int smallest = Integer.MAX_VALUE;
            int smallestIndex = 0;
            for (int i = 0; i < e.length; i++) {
                if (e[i]<= smallest){
                    smallest = e[i];
                    smallestIndex = i;
                }
            }
            return smallestIndex;
        };

        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = Integer.parseInt(input[i]);
        }
        System.out.println(getTheSmallest.apply(numbers));
    }
}
