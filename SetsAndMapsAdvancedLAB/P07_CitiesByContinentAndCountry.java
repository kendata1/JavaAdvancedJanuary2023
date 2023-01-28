package SetsAndMapsAdvancedLAB;

import java.util.*;

public class P07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map <String, Map <String, List<String>>> continentMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] inputArr = scanner.nextLine().split(" ");
            String continent = inputArr[0];
            String country = inputArr[1];
            String city = inputArr[2];

            continentMap.putIfAbsent(continent, new LinkedHashMap<>());
            continentMap.get(continent).putIfAbsent(country, new ArrayList<>());
            continentMap.get(continent).get(country).add(city);

        }
        for (Map.Entry<String, Map<String, List<String>>> bigEntry : continentMap.entrySet()) {
            System.out.printf("%s:%n", bigEntry.getKey());

            for (Map.Entry<String, List<String>> smallEntry : bigEntry.getValue().entrySet()) {
                System.out.printf("  %s -> ",smallEntry.getKey());

                for (int i = 0; i < smallEntry.getValue().size(); i++) {
                    if (i == smallEntry.getValue().size() - 1){
                        System.out.printf("%s%n",smallEntry.getValue().get(i));
                    } else {
                        System.out.printf("%s, ", smallEntry.getValue().get(i));
                    }
                }
            }
        }
    }
}
