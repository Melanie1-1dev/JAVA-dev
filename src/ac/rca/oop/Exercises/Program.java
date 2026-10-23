import java.io.BufferedReader;
import java.io.FileReader;

public static void main(String[] args) {
    int[] scores = new int[3];
    scores[0] = 10;
    scores[1] = 20;
    scores[2] = 40;
    int c = 0;

    try {
        // MOVED INSIDE THE TRY BLOCK:
        BufferedReader bf = new BufferedReader(new FileReader("note.txt"));

        c = scores[3]; // Note: This will trigger the catch block below!
        System.out.println("There is ....");

        bf.close(); // Clean up your file reader resource

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught an array bounds error!");
        throw new RuntimeException(e);

    } catch (java.io.FileNotFoundException e) { // Catches the file reader error
        System.out.println("Caught error: note.txt file was not found!");

    } catch (java.io.IOException e) { // Catches file closing errors
        System.out.println("An error occurred handling the file.");

    } finally {
        System.out.println("After operation");
    }
}
