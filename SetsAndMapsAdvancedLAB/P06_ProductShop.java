package SetsAndMapsAdvancedLAB;

import java.util.*;

public class P06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> storeInfoMap = new TreeMap<>();


        while (!input.equals("Revision")){
            String [] inputArr = input.split(", ");

            String shop = inputArr [0];
            String product = inputArr [1];
            double price = Double.parseDouble(inputArr [2]);

            storeInfoMap.putIfAbsent(shop, new LinkedHashMap<>());

            storeInfoMap.get(shop).put(product,price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry : storeInfoMap.entrySet()) {
            System.out.printf("%s->%n",entry.getKey());

            for (Map.Entry<String, Double> smallEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", smallEntry.getKey(),smallEntry.getValue());
            }
        }
    }
}
