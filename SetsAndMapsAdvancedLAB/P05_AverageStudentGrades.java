package SetsAndMapsAdvancedLAB;

import java.util.*;

public class P05_AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map <String, List<Double>> averageGradesMap = new TreeMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String [] inputArr = scanner.nextLine().split(" ");
            String studentName = inputArr[0];
            double grade = Double.parseDouble(inputArr[1]);

            averageGradesMap.putIfAbsent(studentName, new ArrayList<>());

            averageGradesMap.get(studentName).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : averageGradesMap.entrySet()) {
            System.out.print(entry.getKey() + " -> ");

            double sum = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                double currentGrade = entry.getValue().get(i);
                System.out.printf("%.2f ", currentGrade);
                sum += currentGrade;
            }
            double average = sum / entry.getValue().size();

            System.out.printf("(avg: %.2f)%n", average);

        }
    }
}
