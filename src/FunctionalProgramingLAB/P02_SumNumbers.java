package src.FunctionalProgramingLAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function <String, Integer> parse = e -> Integer.parseInt(e);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(e -> parse.apply(e)).collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(e -> e).sum();

        System.out.printf("Count = %d%nSum = %d",numbers.size(),sum);
    }
}
