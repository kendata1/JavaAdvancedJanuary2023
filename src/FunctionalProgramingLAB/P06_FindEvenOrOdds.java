package src.FunctionalProgramingLAB;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class P06_FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] borders = scanner.nextLine().split(" ");

        int lowerBord = Integer.parseInt(borders[0]);
        int upperBord = Integer.parseInt(borders[1]);

        String condition = scanner.nextLine();

        Predicate<Integer> isOddOrEven = condition.equals("odd") ? (e -> e % 2 != 0) : (e -> e % 2 == 0);

        IntStream.rangeClosed(lowerBord, upperBord)
                .filter(e -> isOddOrEven.test(e))
                .forEach(e -> System.out.print(e + " "));

    }
}
