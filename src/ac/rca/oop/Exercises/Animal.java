package ac.rca.oop.Exercises;

public class Animal extends Organism {
    private String sound;

    public Animal(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return this.sound;
    }
//    public static void hello(){
//        System.out.println("This animal says: "  + this.sound);
//    }

}
