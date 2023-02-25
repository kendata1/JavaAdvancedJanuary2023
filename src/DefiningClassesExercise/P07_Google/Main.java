package src.DefiningClassesExercise.P07_Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personMap = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" ");
            String personName = inputArr[0];
            String type = inputArr[1];
            String typeName = inputArr[2];
            String options = inputArr[3];
            double salary = 0;

            if (inputArr.length == 5) {
                salary = Double.parseDouble(inputArr[4]);
            }
            Person person = null;
            personMap.putIfAbsent(personName, new Person(personName));
            if (!personMap.containsKey(personName)){
                person = new Person(personName);
            } else person = personMap.get(personName);

            switch (type) {
                case "company":
                    Company company = new Company(typeName, options, salary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(typeName, options);
                    person.getPokemon().add(pokemon);
                    break;
                case "parents":
                    Parents parents = new Parents(typeName, options);
                    person.getParentsList().add(parents);
                    break;
                case "children":
                    Children child = new Children(typeName, options);
                    person.getChildrenList().add(child);
                    break;
                case "car":
                    Car car = new Car(typeName, options);
                    person.setCar(car);
                    break;
            }
            input = scanner.nextLine();
        }
        String nameInput = scanner.nextLine();

        System.out.println(personMap.get(nameInput));

    }
}
