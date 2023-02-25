package src.SetsAndMapsAdvancedExsercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String,String> emailMap = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email = scanner.nextLine();

            String [] emailArr = email.split("\\.");

            if (isValid(emailArr[emailArr.length - 1])){
                emailMap.put(name,email);
            }
            name = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : emailMap.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }

    }
    public static boolean isValid (String string){
        return (!(string.equals("com") || string.equals("us") || string.equals("uk")));
    }
}
