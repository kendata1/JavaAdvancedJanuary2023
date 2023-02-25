package src.FunctionalProgramingLAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate <String> isUppercase = e -> Character.isUpperCase(e.charAt(0));

        List<String> uppercaseWords = Arrays.stream(scanner.nextLine().split(" ")).filter(word -> isUppercase.test(word)).collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        uppercaseWords.stream().forEach(word -> System.out.println(word));
    }
}
