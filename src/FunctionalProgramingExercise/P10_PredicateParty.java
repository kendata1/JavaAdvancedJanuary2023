package src.FunctionalProgramingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class P10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BiPredicate<String ,String> startsWith = (e, s) -> e.startsWith(s);
        BiPredicate <String, String> endsWith = (e, s) -> e.endsWith(s);
        BiPredicate <String, Integer> hasLength = (e, l) -> e.length() == l;

        List<String> guests = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Party!")){
            String [] commandArr = commandInput.split(" ");
            String command = commandArr [0];

            if (command.equals("Double")){
                switch (commandArr [1]){
                    case "StartsWith":
                        List<String> startList = guests.stream().filter(e -> startsWith.test(e, commandArr[2])).collect(Collectors.toList());
                        guests.addAll(startList);
                        break;
                    case "EndsWith":
                        List<String> endList = guests.stream().filter(e -> endsWith.test(e, commandArr[2])).collect(Collectors.toList());
                        guests.addAll(endList);
                        break;
                    case "Length":
                        List<String> hasLengthList = guests.stream().filter(e -> hasLength.test(e, Integer.parseInt(commandArr[2]))).collect(Collectors.toList());
                        guests.addAll(hasLengthList);
                        break;
                }

            }else if (command.equals("Remove")) {
                switch (commandArr [1]){
                    case "StartsWith":
                        guests = guests.stream().filter(e -> !startsWith.test(e, commandArr[2])).collect(Collectors.toList());
                        break;
                    case "EndsWith":
                        guests = guests.stream().filter(e -> !endsWith.test(e, commandArr[2])).collect(Collectors.toList());
                        break;
                    case "Length":
                        guests = guests.stream().filter(e -> !hasLength.test(e, Integer.parseInt(commandArr[2]))).collect(Collectors.toList());
                        break;
                }
            }
            commandInput = scanner.nextLine();
        }
        if (guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            guests.sort(String::compareTo);
            System.out.println(String.join(", ",guests) + " are going to the party!");
        }
    }
}
