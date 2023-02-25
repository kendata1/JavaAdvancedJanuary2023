package src.SetsAndMapsAdvancedLAB;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> carsSet = new LinkedHashSet<>();

        while (!input.equals("END")){
            String [] inputArr = input.split(", ");
            String command = inputArr[0];
            String plateNumber = inputArr[1];

            if (command.equals("IN")){
                carsSet.add(plateNumber);
            } else if (command.equals("OUT")){
                carsSet.remove(plateNumber);
            } else {
                System.out.println("Invalid command!");
            }
            input = scanner.nextLine();
        }
        if (carsSet.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            carsSet.forEach(e -> System.out.println(e));
        }
    }
}
