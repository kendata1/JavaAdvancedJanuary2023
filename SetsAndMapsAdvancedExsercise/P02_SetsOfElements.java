package SetsAndMapsAdvancedExsercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstSetLength = inputArr[0];
        int secondSetLength = inputArr[1];

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> resultSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNum);
        }
        for (int i = 0; i < secondSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (firstSet.contains(currentNum)){
                resultSet.add(currentNum);
            }
        }
        for (Integer integer : resultSet) {
            System.out.print(integer + " ");
        }
    }
}
