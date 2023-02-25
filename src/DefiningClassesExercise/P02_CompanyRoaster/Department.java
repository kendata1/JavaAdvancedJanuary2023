package src.DefiningClassesExercise.P02_CompanyRoaster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List <Employee> employeeList = new ArrayList<>();

    private static double averageSalary;

    public Department(String name, List<Employee> employeeList) {
        this.name = name;
        this.employeeList = employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public double getAverageSalary() {
        return getAverageSalary(this.employeeList);
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    private static double getAverageSalary (List <Employee> employeeList) {
        double totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employeeList.size();
    }
}
