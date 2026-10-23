package ac.rca.oop.Collections;
import java.util.*;

public class SortingProgram {
    public static void main(String[]args){
        TreeSet<Student> sts=new TreeSet<Student>();
        sts.add(new Student(205,"Melany","NDIKUBWIMANA","melany@gmail.com",15));
        sts.add(new Student(205,"Melany","NDIKUBWIMANA","melany@gmail.com",15));
        sts.add(new Student(205,"Melany","NDIKUBWIMANA","melany@gmail.com",15));
        Student s1=new Student(249,"John","MUGISHA","jmugisha@gmail.com",16);
        Student s2=new Student(250,"John","MUGABO","jmugabo@gmail.com",17);
        Student s3=new Student(250,"John","GASANA","gmuneza@gmail.com",18);
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);
        System.out.println("List of Students"+ sts.size());

        for(Student s:sts){
            System.out.println(s);
        }


    }
}