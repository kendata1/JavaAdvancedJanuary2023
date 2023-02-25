package src.FunctionalProgramingLAB;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> addVat = e -> e * 1.2;

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", ")).map(e -> Double.parseDouble(e)).map(e -> addVat.apply(e)).forEach(e -> System.out.printf("%.2f%n",e));
    }
}
