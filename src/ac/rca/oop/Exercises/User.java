package ac.rca.oop.Exercises;

public class User {
    protected String name;
    protected int age;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(String name, int age) {
        setName(name); // Uses validation
        setAge(age);   // Uses validation
    }

    // Getter for Name
    public String getName() {
        return this.name;
    }

    // Setter for Name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    // Getter for Age
    public int getAge() {
        return this.age;
    }

    // Setter for Age with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Warning: Age cannot be negative. Setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Initializing 3 instances of User
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);
        User user3 = new User("Charles", 35);

        // Printing details using getter methods
        System.out.println("User 1: Name = " + user1.getName() + ", Age = " + user1.getAge());
        System.out.println("User 2: Name = " + user2.getName() + ", Age = " + user2.getAge()); // Fixed getter
        System.out.println("User 3: Name = " + user3.getName() + ", Age = " + user3.getAge());
    }
}
