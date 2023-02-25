package src.DefiningClassesExercise.P05_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engineList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();

        int engineCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < engineCount; i++) {

            String[] inputArr = scanner.nextLine().split(" ");
            String model = inputArr[0];
            int power = Integer.parseInt(inputArr[1]);
            int displacement = 0;
            String efficiency = null;

            if (inputArr.length == 4) {
                displacement = Integer.parseInt(inputArr[2]);
                efficiency = inputArr[3];
            } else if (inputArr.length == 3) {
                if (Character.isDigit(inputArr[2].charAt(0))) {
                    displacement = Integer.parseInt(inputArr[2]);
                } else {
                    efficiency = inputArr[2];
                }
            }
            Engine engine = new Engine(model, power, displacement, efficiency);
            engineList.add(engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < carsCount; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String model = inputArr[0];
            String engineName = inputArr[1];
            int weight = 0;
            String color = null;

            if (inputArr.length == 4) {
                weight = Integer.parseInt(inputArr[2]);
                color = inputArr[3];
            } else if (inputArr.length == 3) {
                if (Character.isDigit(inputArr[2].charAt(0))) {
                    weight = Integer.parseInt(inputArr[2]);
                } else {
                    color = inputArr[2];
                }
            }
            Engine carEngine = null;
            for (Engine engine : engineList) {
                if (engineName.equals(engine.getModel())){
                    carEngine = engine;
                    break;
                }
            }
            Car car = new Car(model,carEngine,weight,color);
            carsList.add(car);
        }
        for (Car car : carsList) {
            System.out.print(car.toString());
        }
    }
}
