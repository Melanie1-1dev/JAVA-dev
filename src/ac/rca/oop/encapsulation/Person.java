package ac.rca.oop.encapsulation;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public Person(){}

    public Person(String fName, String lName,String email, int age){
        this.firstName=fName;
        this.lastName=lName;
        this.email=email;
        this.age=age;
    }

    public void setFirstName(String fName) {
        this.firstName=fName;
    }
    public String getFirstName(){
        return this.firstName;
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
}
