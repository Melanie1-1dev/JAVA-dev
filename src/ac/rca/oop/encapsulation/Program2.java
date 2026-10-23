package ac.rca.oop.encapsulation;

public class Program2 {
    public static void main(String[] args) {
        int myScore = 10;
        Integer myScore2 = 30;
        char c = 200;
        char c1 = 'A';
        short a = 10;
        short b = 15;
        double d1 = 20;
        double d2 = 25.0;
        int abc = c;
        int def = a;
        short fgh = (short) myScore;

        // Fixed the String constructor syntax
        String name1 = new String("Mary");
        String name2 = new String("Mary");
        String s3 = new String("John");
        String s4 = name2;

        if (name1.equals(name2)) {
            System.out.println("Yes");
        }

        System.out.println((name1 == name2));
        System.out.println(name1.equals(name2));
        System.out.println(myScore2.hashCode());
    }
}
