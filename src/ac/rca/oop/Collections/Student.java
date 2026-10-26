package ac.rca.oop.Collections;

import java.util.Objects;

// 1. You MUST add "implements Comparable<Student>" here
public class Student implements Comparable<Student> {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public Student(int id, String firstName, String lastName, String email, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    // 2. You MUST implement this method so Java knows how to sort them
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); // Sorts by ID
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, age);
    }

    @Override
    public String toString() {
        return id + " - " + firstName + " " + lastName;
    }
}
