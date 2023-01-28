package SetsAndMapsAdvancedExsercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,String> phoneBook = new HashMap<>();

        while (!input.equals("search")){
            String [] inputArr = input.split("-");
            String name = inputArr[0];
            String phoneNumber = inputArr[1];

            phoneBook.put(name,phoneNumber);

            input = scanner.nextLine();
        }
        String currentName = scanner.nextLine();

        while (!currentName.equals("stop")){
            if(phoneBook.containsKey(currentName)){
                System.out.printf("%s -> %s%n", currentName,phoneBook.get(currentName));
            } else {
                System.out.printf("Contact %s does not exist.%n",currentName);
            }

            currentName = scanner.nextLine();
        }
    }
}
