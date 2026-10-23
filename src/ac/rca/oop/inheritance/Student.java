package ac.rca.oop.inheritance;

import ac.rca.oop.encapsulation.Person;

public class Student extends Person {
    private String school;
    private String combination;
    private String level;

    public Student() {
    }

    public Student(String fName, String lName,String email, int age, String school, String combination, String level) {
        super(fName, lName, email,age);
        this.school = school;
        this.combination = combination;
        this.level = level;
    }

    public Student(String number, String melanie, String ndikubwimana, String mail) {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String getEmail(){
        return "My email is: "+super.getEmail();
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName: "+ this.getFirstName()+
                ", LastName: "+this.getLastName()+
                ", email: "+this.getEmail()+
                ", school='" + school + '\'' +
                ", combination='" + combination + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
