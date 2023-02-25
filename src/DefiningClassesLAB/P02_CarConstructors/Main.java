package src.DefiningClassesLAB.P02_CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car2> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String brand = inputArr[0];

            if (inputArr.length == 1){
                Car2 car2 = new Car2(brand);
                carList.add(car2);
            } else {
                String model = inputArr[1];
                int hp = Integer.parseInt(inputArr[2]);

                Car2 car2 = new Car2(brand,model,hp);
                carList.add(car2);
            }

        }
        for (Car2 car : carList) {
            System.out.println(car.carInfo());
        }
    }
}
