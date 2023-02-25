package src.SetsAndMapsAdvancedLAB;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Set<Integer> firstPlayerSet = new LinkedHashSet<>(firstPlayerCards);
        Set<Integer> secondPlayerSet = new LinkedHashSet<>(secondPlayerCards);

        for (int i = 0; i < 50; i++) {

            int firstNumber = firstPlayerSet.iterator().next();
            firstPlayerSet.remove(firstNumber);

            int secondNumber = secondPlayerSet.iterator().next();
            secondPlayerSet.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayerSet.add(firstNumber);
                firstPlayerSet.add(secondNumber);

            } else if (secondNumber > firstNumber) {
                secondPlayerSet.add(firstNumber);
                secondPlayerSet.add(secondNumber);
            }

            if (!firstPlayerSet.iterator().hasNext()){
                break;
            }
            if (!secondPlayerSet.iterator().hasNext()){
                break;
            }
        }
        if (firstPlayerSet.size() > secondPlayerSet.size()){
            System.out.println("First player win!");
        } else if (secondPlayerSet.size() > firstPlayerSet.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
