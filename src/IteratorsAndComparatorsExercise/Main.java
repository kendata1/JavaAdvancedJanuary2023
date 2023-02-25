package src.IteratorsAndComparatorsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ListyIterator listyIterator = null;

        while (!input.equals("END")){
            String [] inputArr = input.split(" ");
            String command = inputArr [0];


            switch (command){
                case "Create":
                    listyIterator = new ListyIterator<String>(Arrays.copyOfRange(inputArr,1,inputArr.length));
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
