package SetsAndMapsAdvancedLAB;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        Map <Double, Integer> numbersMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            double currentNum = Double.parseDouble(input[i]);

            numbersMap.putIfAbsent(currentNum, 0);
            numbersMap.put(currentNum ,numbersMap.get(currentNum) + 1);

        }

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
