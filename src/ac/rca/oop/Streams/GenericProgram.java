package ac.rca.oop.Streams;

import java.util.*;

public class GenericProgram {
    public static void main(String[] args) {

        Point<Integer> p1 = new Point<>(20, 30);
        Point<Integer> p2 = new Point<>(30, 25);
        System.out.println("p1 is " + p1 + " and p2 is " + p2);

        Point<Integer> ps = new Point<>(20, 40);
        Point<Double> p4 = new Point<>(20.5, 30.5);
        Point<String> joint = new Point<>("Gasabo", "Kicukiro");

        List<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(3200);
        nums.add(300);
        nums.add(50);
        nums.add(120);

        for (int i : nums) {
            System.out.println(i);
        }

        List<String> districts = new Stack<String>();
        districts.add("Gasabo");
        districts.add("Kicukiro");
        districts.add("Nyabihu");
        districts.add("Musanze");
        districts.add("Muhanga");

        System.out.println(districts.get(districts.size() - 1));

        for (int i = districts.size() - 1; i >= 0; i--) {
            System.out.println(districts.get(i));
        }

        Set<String> ds = new HashSet<String>();
        ds.add("Gasabo");
        ds.add("Kicukiro");
        ds.add("Nyabihu");
        ds.add("Musanze");
        ds.add("Muhanga");
        ds.add("Bugesera");

        System.out.println("Printing Districts in Hashset: ");

        for (String s : ds) {
            System.out.println(s);
        }
    }
}
