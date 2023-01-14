package StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque <Integer> binaryStack = new ArrayDeque<>();

        if (num == 0){
            System.out.println("0");
        } else {
            while (num > 0) {
                binaryStack.push(num % 2);
                num /= 2;
            }
            while (!binaryStack.isEmpty()){
                System.out.print(binaryStack.pop());
            }
        }
    }
}
