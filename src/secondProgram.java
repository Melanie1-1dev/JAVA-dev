public class secondProgram {
    public  static void main(String[] args){
        // 1. setup the staring bank balance and withdrawal amount

        int accountBalance = 150 ;
        int cashRequested = 40;

        System.out.println("=== Welcome to the Digital ATM ===");
        System.out.println("checking your acccount balance...");

        //2. use an IF/ELSE statement to check if there is enough money

        if (cashRequested <= accountBalance){
            // Deduct the cash from the total balance

            accountBalance = accountBalance - cashRequested;

            System.out.println("Success! Dispensing $" + cashRequested);
            System.out.println("Remaining Balance: $" + accountBalance);

        }
        else {
            System.out.println("Error: Insufficient funds.");
            System.out.println("Your cannot withdraw more than $" + accountBalance);

        }
        System.out.println("Thank you for choosing our bank!");
    }
}
