package ac.rca.oop.Streams;

import ac.rca.oop.Streams.Student;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List elements = new ArrayList();
        elements.add(100);
        elements.add("Hello");
        elements.add("100");
        elements.add("World");
        elements.add(new Date());

        int number = (Integer) elements.get(0);
        String name = (String)elements.get(1);
        Date d = (Date)elements.get(4);
        //int b = (Integer)elements.get(3);
        //System.out.println(number + " " + name + " " + d);
        Student[] students = new Student[4];
        students[0] = new Student(105,"Mary","Mother",100);
        students[1] = new Student(106,"Peter","Thiel",55);
        students[2] = new Student(107,"James","Gosling",67);
        students[3] = new Student(108,"Dan","Christian",17);

        for (int i = 0;i < students.length;i++) {
            //System.out.println(students[i].toString());
        }
        List<Student>   sts = new ArrayList<Student>();
        sts.add(new Student(1,"aa","aa",1));
        Set elts = new HashSet();
        elts.add(100);
        elts.add("Hello");
        elts.add(100);
        elts.add("world");
        elts.add(new Date());
        //System.out.println(elts.size());
        for(Object o:elts) {
            //System.out.println(o);
        }
        List districts = new ArrayList();
        districts.add("Gasabo");
        districts.add("Kicukiro");
        districts.add("Nyarugenge");
        districts.add("Nyabihu");
        districts.add("Gasabo");
        System.out.println(districts.size());
        Set ds = new HashSet();
        ds.add("Gasabo");
        ds.add("Kicukiro");
        ds.add("Nyarugenge");
        ds.add("Nyabihu");
        ds.add("Gasabo");
        System.out.println(ds.size());
    }
}