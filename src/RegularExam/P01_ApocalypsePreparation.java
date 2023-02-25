package src.RegularExam;

import java.util.*;

public class P01_ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque <Integer> textileQueue = new ArrayDeque<>();
        Deque <Integer> medStack = new ArrayDeque<>();

        Map<String, Integer> medicamentMap = new TreeMap<>();

        String [] textileArr = scanner.nextLine().split(" ");
        String [] medArr = scanner.nextLine().split(" ");

        for (int i = 0; i < textileArr.length; i++) {
            textileQueue.offer(Integer.parseInt(textileArr[i]));
        }

        for (int i = 0; i < medArr.length; i++) {
            medStack.push(Integer.parseInt(medArr[i]));
        }

        while (!textileQueue.isEmpty() && !medStack.isEmpty()){
            int sum = textileQueue.peek() + medStack.peek();

            switch (sum){
                case 30:
                    medicamentMap.putIfAbsent("Patch", 0);
                    medicamentMap.put("Patch", medicamentMap.get("Patch") + 1);
                    medStack.pop();
                    textileQueue.poll();
                    break;
                case 40:
                    medicamentMap.putIfAbsent("Bandage", 0);
                    medicamentMap.put("Bandage", medicamentMap.get("Bandage") + 1);
                    medStack.pop();
                    textileQueue.poll();
                    break;
                case 100:
                    medicamentMap.putIfAbsent("MedKit", 0);
                    medicamentMap.put("MedKit", medicamentMap.get("MedKit") + 1);
                    medStack.pop();
                    textileQueue.poll();
                    break;
                default:
                    if (sum > 100) {
                        int remainingSum = sum - 100;
                        medicamentMap.putIfAbsent("MedKit", 0);
                        medicamentMap.put("MedKit", medicamentMap.get("MedKit") + 1);

                        medStack.pop();
                        textileQueue.poll();

                        medStack.push(medStack.pop() + remainingSum);
                    } else {
                        textileQueue.poll();
                        medStack.push(medStack.pop() + 10);
                    }
                    break;
            }
        }

        if (textileQueue.isEmpty() && medStack.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textileQueue.isEmpty()){
            System.out.println("Textiles are empty.");
        } else if (medStack.isEmpty()){
            System.out.println("Medicaments are empty.");
        }

        if (!medicamentMap.isEmpty()) {
            medicamentMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
        }

        if (!medStack.isEmpty()) {
            System.out.println("Medicaments left: " + medStack.toString().replaceAll("[\\[\\]]", ""));
        } else if (!textileQueue.isEmpty()){
            System.out.println("Textiles left: " + textileQueue.toString().replaceAll("[\\[\\]]", ""));
        }
    }
}
