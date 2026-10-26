package ac.rca.oop.Collections;

import ac.rca.oop.Collections.Student;
import java.util.*;

public class SortingProgram {

    public SortingProgram() {
        super();
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(205, "Melanie", "NdikubwImana", "mel123@", 18));
        students.add(new Student(205, "Melanie", "NdikubwImana", "mel123@", 18));
        students.add(new Student(205, "Melanie", "NdikubwImana", "mel123@", 18));
        students.add(new Student(249, "John", "Mugisha", "jmugish123@", 18));
        students.add(new Student(250, "John", "Mugabo", "jmugabo123@", 18));
        students.add(new Student(250, "John", "GASANA", "gasana123@", 18));

        System.out.println("Printing List of students " + students.size());

        Student s4 = new Student(303, "Clever", "Manzi", "cmanzi@gmail.com", 12);
        Student s5 = new Student(303, "Clever", "Manzi", "cmanzi@gmail.com", 12);

        Collections.sort(students, Collections.reverseOrder());

        for (Student student : students) {
            System.out.println(student);
        }

        Student s6 = new Student(205, "Melanie", "NdikubwImana", "mel123@", 18);
        Student s7 = new Student(249, "John", "Mugisha", "jmugish123@", 18);

        System.out.println("\nComparing two different Student objects:");

        System.out.println("Student 1: " + s6);
        System.out.println("Student 2: " + s7);

        System.out.println("Student 1 hash code: " + s6.hashCode());
        System.out.println("Student 2 hash code: " + s7.hashCode());

        System.out.println("Are they the same object? " + (s6 == s7));

        System.out.println("Do they have the same hash code? " + (s6.hashCode() == s7.hashCode()));
    }
}
