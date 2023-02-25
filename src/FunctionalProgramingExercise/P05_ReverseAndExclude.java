package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int div = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        numbers.stream().filter(e -> e % div != 0).forEach(e -> System.out.print(e + " "));
    }
}
