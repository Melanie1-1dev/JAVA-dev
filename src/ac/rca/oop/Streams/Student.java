package ac.rca.oop.Streams;

import java.io.Serializable;

public class Student implements Serializable {
    public int code;
    public String firstName;
    public String lastName;
    public int age;
    public Student() {}
    public Student(int code,String firstName,String lastName,int age) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}