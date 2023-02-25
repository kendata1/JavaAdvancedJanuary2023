package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class P09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        BiPredicate<List<Integer>, Integer> isDivisible = (l, e) -> {
            boolean isDiv = true;
            for (int i = 0; i < l.size(); i++) {
                if(e % l.get(i) != 0){
                    isDiv = false;
                }
            }
            return  isDiv;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(numbers,i)){
                System.out.print(i + " ");
            }
        }
    }
}
