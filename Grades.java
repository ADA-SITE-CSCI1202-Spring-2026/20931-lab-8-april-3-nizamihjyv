import java.util.*;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> studentsGpa = new HashMap<>();
        studentsGpa.put("Alice", 3.5);
        studentsGpa.put("Bob", 3.9);
        studentsGpa.put("Charlie", 3.2);
        studentsGpa.put("Diana", 3.9);
        studentsGpa.put("Ethan", 3.8);

        double maxGpa = Collections.max(studentsGpa.values());

        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentsGpa.entrySet()) {
            if (entry.getValue() == maxGpa) {
                topStudents.add(entry.getKey());
            }
        }

        System.out.println("Highest GPA: " + maxGpa);
        System.out.println("Top student(s): " + String.join(", ", topStudents));

        double sum = 0;
        for (double gpa : studentsGpa.values()) {
            sum += gpa;
        }
        double averageGpa = sum / studentsGpa.size();

        System.out.println("Average GPA: " + averageGpa);

        int belowAverageCount = 0;
        for (double gpa : studentsGpa.values()) {
            if (gpa < averageGpa) {
                belowAverageCount++;
            }
        }

        System.out.println("Number of students below average: " + belowAverageCount);
    }
}