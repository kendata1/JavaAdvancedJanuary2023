package src.ExamPreparationLab;

import java.util.*;
import java.util.stream.Collectors;

public class P01_PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> liquidsQueue = new ArrayDeque<>();
        Deque<Integer> ingredientsStack = new ArrayDeque<>();

        Map<String, Integer> foodMap = new LinkedHashMap<>();
        foodMap.put("Biscuit", 0);
        foodMap.put("Cake", 0);
        foodMap.put("Pie", 0);
        foodMap.put("Pastry", 0);

        String[] liquids = scanner.nextLine().split(" ");
        String[] ingredients = scanner.nextLine().split(" ");

        for (int i = 0; i < liquids.length; i++) {
            liquidsQueue.offer(Integer.parseInt(liquids[i]));
        }

        for (int i = 0; i < ingredients.length; i++) {
            ingredientsStack.push(Integer.parseInt(ingredients[i]));
        }

        while (!liquidsQueue.isEmpty() && !ingredientsStack.isEmpty()) {
            int sumOfElements = liquidsQueue.poll() + ingredientsStack.peek();

            switch (sumOfElements) {
                case 25:
                    foodMap.put("Biscuit", foodMap.get("Biscuit") + 1);
                    ingredientsStack.pop();
                    break;
                case 50:
                    foodMap.put("Cake", foodMap.get("Cake") + 1);
                    ingredientsStack.pop();
                    break;
                case 75:
                    foodMap.put("Pastry", foodMap.get("Pastry") + 1);
                    ingredientsStack.pop();
                    break;
                case 100:
                    foodMap.put("Pie", foodMap.get("Pie") + 1);
                    ingredientsStack.pop();
                    break;
                default:
                    ingredientsStack.push(3 + ingredientsStack.pop());
                    break;
            }
        }
        boolean craftedEverything = true;

        for (Map.Entry<String, Integer> entry : foodMap.entrySet()) {
            if (entry.getValue() < 1) {
                craftedEverything = false;
            }
        }

        if (craftedEverything) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        if (liquidsQueue.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            System.out.println(liquidsQueue.toString().replaceAll("[\\[\\]]", ""));

        }

        if (ingredientsStack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            System.out.println(ingredientsStack.toString().replaceAll("[\\[\\]]", ""));
        }

        for (Map.Entry<String, Integer> integerEntry : foodMap.entrySet()) {
            System.out.printf("%s: %d%n", integerEntry.getKey(), integerEntry.getValue());
        }
    }
}
