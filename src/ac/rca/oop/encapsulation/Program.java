package ac.rca.oop.encapsulation;

import ac.rca.oop.inheritance.Student;
import org.w3c.dom.ls.LSOutput;


public class Program {

    public  static int value = 20;
    public int value2 = 30;

    public int addition(int a, int b){
        return a + value;
    }

    public static int addition(int a, int b, int c){
        return a + b + c;
    }
//    public static void main(String []args){
//        Laptop laptop1= new Laptop();
//        laptop1.setSerialNumber(15);
//        laptop1.manufacturer="HP";
//        laptop1.manufacturedDate=2026;
//        laptop1.model="pro book";

//        System.out.println("The first Laptop's details are: S/N " + laptop1.getSerialNumber()+
//                ", Manufacturer: "+laptop1.manufacturer+
//                ", Model: "+laptop1.model+
//                ", Year: " +laptop1.manufacturedDate);

    //        Laptop laptop2= new Laptop(19, "Lenovo","ABC", 2023);
//
//        System.out.println("The second Laptop's details are: S/N " + laptop2.getSerialNumber()+
//            ", Manufacturer: "+laptop2.manufacturer+
//                ", Model: "+laptop2.model+
//                ", Year: " +laptop2.manufacturedDate);
//
//        System.out.println(laptop1);
//        System.out.println(laptop2);
//
//
    public static void main(String []args){
        Laptop laptop1 = new Laptop();
        laptop1.setSerialNumber(15);
        laptop1.setManufacturer("HP");
        laptop1.setModel("Model");
        laptop1.setManufacturedYear(2024);

        System.out.println(laptop1);

        Laptop laptop2 = new Laptop (201, "Lenovo", "ThinkBook", 2023);
        System.out.println(laptop2);

        Student s1= new Student("Mary","Linaa","deenov@gmail.com",16,"RCA", "SPE", "L4");
        System.out.println(s1);
        Person p3= new Student("KHAN", "Josh","josh@gmail.com",17,"RCA","GenAI","L5");
        System.out.println(p3);
        // Student s4=new Person(); This cant be possible because not every person is a student.
        Object s5= new Student("ISHIMWE", "Eunice", "eunice@gmail.com", 19,"GS GAhini","Medecine","Year one");
        System.out.println(s5);

        System.out.println(value);
        System.out.println(addition(10, 30, 40));

    }



}
