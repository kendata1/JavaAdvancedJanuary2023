package src.DefiningClassesLAB.P03_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final String END_COMMAND = "End";
    public static final String CREATE = "Create";
    public static Map<Integer, BankAccount> accountMap;
    public static final String DEPOSIT = "Deposit";
    public static final String SET_INTEREST = "SetInterest";
    public static final String GET_INTEREST = "GetInterest";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        accountMap = new HashMap<>();


        while (!END_COMMAND.equals(input)){
            String result = "";
            String [] inputArr = input.split(" ");
            String command = inputArr [0];

            switch (command){
                case CREATE: result = createAccount(); break;
                case DEPOSIT: result = deposit(inputArr); break;
                case SET_INTEREST: setInterest(inputArr); break;
                case GET_INTEREST: result = getInterest(inputArr); break;
            }
            if (!result.isEmpty()){
                System.out.println(result);
            }

            input = scanner.nextLine();
        }
    }
    public static String createAccount () {
        BankAccount bankAccount = new BankAccount();
        int id = bankAccount.getId();

        accountMap.put(id,bankAccount);

        return String.format("Account ID%d created",id);
    }
    public static String deposit (String [] inputArr) {
        int id = Integer.parseInt(inputArr [1]);
        double amount = Double.parseDouble(inputArr [2]);

        if (accountMap.containsKey(id)){
            accountMap.get(id).deposit(amount);
            return String.format("Deposited %d to ID%d", (int) amount, id);
        } else {
            return "Account does not exist";
        }
    }
    public static void setInterest (String [] inputArr) {
        double interest = Double.parseDouble(inputArr [1]);

        BankAccount.setInterestRate(interest);
    }
    public static String getInterest (String [] inputArr) {
        int id = Integer.parseInt(inputArr [1]);
        int years = Integer.parseInt(inputArr [2]);

        if (accountMap.containsKey(id)){
            double interest = accountMap.get(id).getInterestRate(years);
            return String.format("%.2f", interest);
        } else {
            return "Account does not exist";
        }
    }
}
