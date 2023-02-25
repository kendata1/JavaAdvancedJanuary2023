package src.DefiningClassesLAB.P01_CarInfo;

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
            String brand = inputArr[0];
            String model = inputArr[1];
            int hp  = Integer.parseInt(inputArr[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(hp);

            carList.add(car);
        }
        for (Car car : carList) {
            System.out.println(car.carInfo());
        }

    }
}
