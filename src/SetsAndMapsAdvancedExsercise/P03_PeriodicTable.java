package src.SetsAndMapsAdvancedExsercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elementsSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String [] inputArr = scanner.nextLine().split(" ");

            for (int j = 0; j < inputArr.length; j++) {
                String currentSymbol = inputArr[j];
                elementsSet.add(currentSymbol);
            }
        }
        for (String s : elementsSet) {
            System.out.print(s + " ");
        }
    }
}
