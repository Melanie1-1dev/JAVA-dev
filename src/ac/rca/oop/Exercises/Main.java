package ac.rca.oop.Exercises;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);

        User u1 = new User("Alice", 25);
        User u2 = new User("Bob", 30);
        User u3 = new User("Alice", 25);

        // 2. print using the toString() from step 1 just to see them

        System.out.println("U1 looks like: " + u1);
        System.out.println("U3 looks like: " + u3);
        System.out.println("----------------------");

        //3. The exact comparison prints requested by your assignement

        System.out.println(u1 == u3);
        System.out.println(u1.equals(u3));
        System.out.println(u1.equals(u2));


        System.out.println(user1);
        System.out.println(user2);

    }
}
