// Launchcode Class 3.2 Prep 4

//HashMap: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers) instead of names and grades. In this case, however, the keys should be integers (the IDs) and the values should be strings (the names). Modify the roster printing code accordingly.

package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyGradebookHashMap {

    /**
     * Template from Launchcode
     */

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer studentId = 1;
        String name;

        System.out.println("Enter your students (or 0 to finish):");

        // Get student names and grades
        while (studentId != 0) {

            System.out.println("Student ID: ");
            studentId = in.nextInt();

            if (studentId != 0) {
                System.out.println("Name: ");
                name = in.next();
                students.put(studentId, name);
            }

        }

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}

