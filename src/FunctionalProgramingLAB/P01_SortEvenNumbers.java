package src.FunctionalProgramingLAB;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());


        numbers.removeIf(e -> e % 2 != 0);
        System.out.println(String.join(", ",  numbers + "").replaceAll("[\\[\\]]",""));

        numbers.sort(Comparator.naturalOrder());
        System.out.println(String.join(", ", numbers + "").replaceAll("[\\[\\]]",""));
    }
}
