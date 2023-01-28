package SetsAndMapsAdvancedExsercise;

import java.util.*;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> charSet = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSym = input.charAt(i);

            charSet.putIfAbsent(currentSym, 0);

            charSet.put(currentSym, charSet.get(currentSym) + 1);

        }
        for (Map.Entry<Character, Integer> entry : charSet.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
