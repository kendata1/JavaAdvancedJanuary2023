package SetsAndMapsAdvancedLAB;

import java.util.Scanner;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeSet<String> guestsSet = new TreeSet<>();

        while (!input.equals("PARTY")) {
            guestsSet.add(input);
            input = scanner.nextLine();
        }

            String guest = scanner.nextLine();
            while (!guest.equals("END")) {
                guestsSet.remove(guest);
                guest = scanner.nextLine();
            }
            System.out.println(guestsSet.size());
            guestsSet.forEach(e -> System.out.println(e));
    }
}
