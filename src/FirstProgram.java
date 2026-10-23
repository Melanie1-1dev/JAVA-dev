import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args){

        // 1. Inputs (Data stored in variables)

        double billAmount = 50.00; // The total cost of the food ($50)
        double tipPercentage = 0.15; // 15% tip expressed as a decimal

        // 2. calculations (The logic)

        double tipAmount = billAmount * tipPercentage;
        double totalBill = billAmount + tipAmount;

        // 3. Outputs (Printing the results)

        System.out.println("--- Receipt summary ---");
        System.out.println("Orginal Bill: $" + billAmount);
        System.out.println("Tip Amount (15%): $" + tipAmount);
        System.out.println("Total Amount to pay: $" + totalBill);

        // 1. Setup the secret number and the scanner tool
        int secretNumber = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("🫶 Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 10");
        // 2. Read the user's guess from the keyboard

        int userGuess = scanner.nextInt();

        // 3. Check if the guess is right or wrong using if/else logic

        if(userGuess == secretNumber){
            System.out.println("🎉 Correct! You guessed the magic number!");

        } else if (userGuess > secretNumber) {
            System.out.println(" ❌ Too high! The secret number was " + secretNumber + ".");


        }
        else {
            System.out.println("❌ Too low! the secret number was " + secretNumber  + ".");
        }
        // close the scanner tool to clean up memory

        String correctUsername = "admin";
        String correctPassword = "password123";

        Scanner scannerr = new Scanner(System.in);
        System.out.println("---SECURE LOGIN PORTAL ---");

        // 2. Get username input

        System.out.println ("Enter username: ");
        String inputUsername = scannerr.nextLine(); // .nextLine() reads text string

        // 3.Get password input

        System.out.println("Enter password: ");
        String inputPassword = scannerr.nextLine();

        // 4. Validate credentials using .equals()
        if(inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)){
            System.out.println("\n ✅ Access Granted Welcome back, Admin.");

        }
        else{
            System.out.println("\n ❌ Access Denied! Invalid username or password.");

        }

        scannerr.close();

    }

}
