package ac.rca.oop.Exercises;

public class Run {
    public static void main(String[] args){
        Dog myDog = new Dog();
        Wolf myWolf = new Wolf();
        Cat myCat = new Cat();
        Lion myLion = new Lion();

        System.out.println("The dog says: " + myDog.getSound());
        System.out.println("The wolf says: " + myWolf.getSound());
        System.out.println("The Cat says:" + myCat.getSound());
        System.out.println("The Lion says: " + myLion.getSound());
    }
}
