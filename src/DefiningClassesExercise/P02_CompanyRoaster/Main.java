package src.DefiningClassesExercise.P02_CompanyRoaster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();
        Map<String, Department> departmentMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String [] inputArr = scanner.nextLine().split(" ");

            String name = inputArr[0];
            double salary = Double.parseDouble(inputArr[1]);
            String position = inputArr[2];
            String departmentName = inputArr[3];

            if (inputArr.length == 5){
                String email = inputArr[4];
                Employee employee = new Employee(name, salary,position,departmentName, email);
                employeeList.add(employee);
            } else if (inputArr.length == 6){
                String email = inputArr[4];
                int age = Integer.parseInt(inputArr[5]);
                Employee employee = new Employee(name, salary,position,departmentName, email, age);
                employeeList.add(employee);
            } else {
                Employee employee = new Employee(name, salary,position,departmentName);
                employeeList.add(employee);
            }

            Department department = new Department(departmentName, new ArrayList<>());
                departmentMap.put(departmentName, department);
            }

        for (Map.Entry<String, Department> entry : departmentMap.entrySet()) {
            List <Employee> listToAdd = employeeList.stream().filter(e -> e.getDepartment().equals(entry.getKey())).collect(Collectors.toList());
            entry.getValue().setEmployeeList(listToAdd);
        }

        double biggestSalary = 0;
        String departmentWithBiggestSalary = "";
        for (Map.Entry<String, Department> entry : departmentMap.entrySet()) {
            double avgSalary = entry.getValue().getAverageSalary();
            String currentDep = entry.getValue().getName();

            if (avgSalary > biggestSalary){
                biggestSalary = avgSalary;
                departmentWithBiggestSalary = currentDep;
            }
        }

        System.out.printf("Highest Average Salary: %s%n", departmentWithBiggestSalary);

        for (Map.Entry<String, Department> entry : departmentMap.entrySet()) {
            if (entry.getKey().equals(departmentWithBiggestSalary)){
                List <Employee> withBiggestSalary = entry.getValue().getEmployeeList();
                withBiggestSalary.sort(Comparator.comparing(Employee::getSalary).reversed());
                for (Employee employee : entry.getValue().getEmployeeList()) {
                    System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
                }
            }
        }
    }
}
