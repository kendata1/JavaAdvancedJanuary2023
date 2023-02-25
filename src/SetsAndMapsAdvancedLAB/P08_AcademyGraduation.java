package src.SetsAndMapsAdvancedLAB;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map <String, Double []> studentsMap = new TreeMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String studentName = scanner.nextLine();
            String [] inputGradesArr = scanner.nextLine().split(" ");
            Double [] gradesArr = new Double[inputGradesArr.length];

            for (int j = 0; j < inputGradesArr.length; j++) {
                gradesArr[j] = Double.parseDouble(inputGradesArr[j]);
            }

            studentsMap.put(studentName,gradesArr);
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.###############");
        for (Map.Entry<String, Double[]> entry : studentsMap.entrySet()) {
            double sum = 0;
            for (int i = 0; i < entry.getValue().length; i++) {
                sum += entry.getValue()[i];
            }
            double average = sum / entry.getValue().length;
            BigDecimal averageGrade = new BigDecimal(average);

            System.out.printf("%s is graduated with ",entry.getKey());
            System.out.print(decimalFormat.format(averageGrade));
            System.out.println();
        }
    }
}
