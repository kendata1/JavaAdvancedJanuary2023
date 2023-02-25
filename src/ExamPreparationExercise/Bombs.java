package src.ExamPreparationExercise;

import java.util.*;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> bombEffectsQueue = new ArrayDeque<>();
        Deque<Integer> bombCasingStack = new ArrayDeque<>();

        String[] bombEffectsArr = scanner.nextLine().split(", ");
        String[] bombCasingArr = scanner.nextLine().split(", ");
        Map<String, Integer> bombsMap = new TreeMap<>();

        bombsMap.put("Cherry Bombs", 0);
        bombsMap.put("Datura Bombs", 0);
        bombsMap.put("Smoke Decoy Bombs", 0);

        for (int i = 0; i < bombEffectsArr.length; i++) {
            bombEffectsQueue.offer(Integer.parseInt(bombEffectsArr[i]));
        }
        for (int i = 0; i < bombCasingArr.length; i++) {
            bombCasingStack.push(Integer.parseInt(bombCasingArr[i]));
        }

        while (!bombEffectsQueue.isEmpty() && !bombCasingStack.isEmpty() && !bombPouchIsFilled(bombsMap)) {
            int sum = bombCasingStack.peek() + bombEffectsQueue.peek();

            switch (sum) {
                case 40:
                    bombCasingStack.pop();
                    bombEffectsQueue.poll();
                    bombsMap.put("Datura Bombs", bombsMap.get("Datura Bombs") + 1);
                    break;
                case 60:
                    bombCasingStack.pop();
                    bombEffectsQueue.poll();
                    bombsMap.put("Cherry Bombs", bombsMap.get("Cherry Bombs") + 1);
                    break;
                case 120:
                    bombCasingStack.pop();
                    bombEffectsQueue.poll();
                    bombsMap.put("Smoke Decoy Bombs", bombsMap.get("Smoke Decoy Bombs") + 1);
                    break;
                default:
                    bombCasingStack.push(bombCasingStack.pop() - 5);
                    break;
            }
        }

        if (bombPouchIsFilled(bombsMap)) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        System.out.print("Bomb Effects: ");
        if (bombEffectsQueue.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(bombEffectsQueue.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.print("Bomb Casings: ");
        if (bombCasingStack.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(bombCasingStack.toString().replaceAll("[\\[\\]]", ""));
        }
        for (Map.Entry<String, Integer> entry : bombsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }

    public static boolean bombPouchIsFilled(Map<String, Integer> map) {
        boolean isFilled = true;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 3) {
                isFilled = false;
            }
        }
        return isFilled;
    }
}
