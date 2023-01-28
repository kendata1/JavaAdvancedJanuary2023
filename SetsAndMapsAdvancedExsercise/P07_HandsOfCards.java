package SetsAndMapsAdvancedExsercise;

import java.util.*;

public class P07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> cardsMap = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String[] nameArr = input.split(": ");
            String name = nameArr[0];

            String[] cardsArr = nameArr[1].split(", ");

            cardsMap.putIfAbsent(name, new HashSet<>());

            for (int i = 0; i < cardsArr.length; i++) {
                String currentCard = cardsArr[i];
                cardsMap.get(name).add(currentCard);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry : cardsMap.entrySet()) {
            String player = entry.getKey();
            Set<String> cards = entry.getValue();
            int totalValue = getCardPoints(cards);

            System.out.printf("%s: %d%n", player, totalValue);

        }


    }

    public static Map<Character, Integer> getSymbolValues() {
        Map<Character, Integer> characterValues = new HashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);
        return characterValues;
    }

    public static int getCardPoints(Set<String> cards) {
        int sum = 0;
        Map<Character, Integer> symbolValues = getSymbolValues();

        for (String card : cards) {
            int value = 0;

            if (card.startsWith("10")) {
                value = 10 * symbolValues.get(card.charAt(2));
            } else {
                int power = symbolValues.get(card.charAt(0));
                int type = symbolValues.get(card.charAt(1));
                value = power * type;
            }
            sum += value;
        }
        return sum;
    }
}

