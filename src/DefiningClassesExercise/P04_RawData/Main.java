package src.DefiningClassesExercise.P04_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List <Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] inputArr = scanner.nextLine().split(" ");

            String model = inputArr[0];
            int speed = Integer.parseInt(inputArr[1]);
            int power = Integer.parseInt(inputArr[2]);
            int weight = Integer.parseInt(inputArr[3]);
            String type = inputArr[4];
            double tire1Pressure = Double.parseDouble(inputArr[5]);
            int tire1Years = Integer.parseInt(inputArr[6]);
            double tire2Pressure = Double.parseDouble(inputArr[7]);
            int tire2Years = Integer.parseInt(inputArr[8]);
            double tire3Pressure = Double.parseDouble(inputArr[9]);
            int tire3Years = Integer.parseInt(inputArr[10]);
            double tire4Pressure = Double.parseDouble(inputArr[11]);
            int tire4Years = Integer.parseInt(inputArr[12]);

            Car car = new Car(model,new Car.Engine(speed,power),new Car.Cargo(weight,type),new Car.Tires(tire1Pressure,tire1Years,tire2Pressure,tire2Years,tire3Pressure,tire3Years,tire4Pressure,tire4Years));
            carList.add(car);
        }
        String command = scanner.nextLine();

        if (command.equals("fragile")){
            for (Car car : carList) {
                if(car.getCargo().getType().equals("fragile") && car.getTires().isFragile()) {
                    System.out.println(car.getModel());
                }
            }
        }else if (command.equals("flamable")){
            for (Car car : carList) {
                if(car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
