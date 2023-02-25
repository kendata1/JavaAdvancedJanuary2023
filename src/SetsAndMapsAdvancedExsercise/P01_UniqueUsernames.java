package src.SetsAndMapsAdvancedExsercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> usernamesSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            usernamesSet.add(username);
        }
        for (String s : usernamesSet) {
            System.out.println(s);
        }
    }
}
