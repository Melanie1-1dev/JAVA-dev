package ac.rca.oop.Collections;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer code;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    public Student() {}

    public Student(int code, String firstName, String lastName, String email, int age) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(code, student.code) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(email, student.email) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, firstName, lastName, email, age);
    }

    @Override
    public String toString() {
        return "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.code.compareTo(student.code) != 0) {
            return this.code.compareTo(student.code);
        }
        if (this.firstName.compareTo(student.firstName) != 0) {
            return this.firstName.compareTo(student.firstName);
        }
        if (this.lastName.compareTo(student.lastName) != 0) {
            return this.lastName.compareTo(student.lastName);
        }
        if (this.email.compareTo(student.email) != 0) {
            return this.email.compareTo(student.email);
        }
        return this.age.compareTo(student.age);
    }
}
