package ac.rca.oop.Collections;

import ac.rca.oop.inheritance.Student;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    public static void main(String[] args){
        HashMap<String, String> contacts = new HashMap<String, String>();
        contacts.put("pm", "O786320752");
        contacts.put("Melanie", "0783567826");
        contacts.put("RIB", "113");
        contacts.put("RBD", "145");
        contacts.put("RCA", "+250787637353");

        System.out.println("The principal phone is"+contacts.get("pm"));
        System.out.println("Looping in map");
        for(String s:contacts.keySet()){
            System.out.println(contacts.get(s));


                }


    }
}
