package ac.rca.oop.Exercises;

import java.util.Objects; // Required import for Objects.equals

public class User1 {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name = '" + name + "', age = " + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        // If they point to the exact same memory slot, they are equal
        if (this == obj) return true;

        // Fixed: Check if the other item is an instance of User1
        if (!(obj instanceof User1)) return false;

        // Fixed: Convert the generic object into a User1 object
        User1 other = (User1) obj;

        // Fixed: Capitalized Objects.equals to safely compare internal content
        return this.age == other.age && Objects.equals(this.name, other.name);
    }
}
