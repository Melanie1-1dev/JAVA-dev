package ac.rca.oop.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class ExcelMenu {

    public static void main(String[] args) {
        // Silences the harmless Log4j warning
        System.setProperty("log4j2.loggerContextFactory",
                "org.apache.logging.log4j.simple.SimpleLoggerContextFactory");

        ExcelManager manager = new ExcelManager("data.xlsx");
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== EXCEL MENU =====");
            System.out.println("1. Read all rows");
            System.out.println("2. Add (write) a new row");
            System.out.println("3. Edit a row");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            try {
                switch (choice) {
                    case "1":
                        manager.readAll();
                        break;

                    case "2":
                        System.out.print("Surname: ");
                        String surname = sc.nextLine();
                        System.out.print("First name: ");
                        String firstName = sc.nextLine();
                        manager.appendRow(surname, firstName);
                        System.out.println("Row added.");
                        break;

                    case "3":
                        System.out.print("Surname of the row to edit: ");
                        String key = sc.nextLine();
                        System.out.print("New first name: ");
                        String newName = sc.nextLine();
                        boolean ok = manager.editCell(0, key, 1, newName);
                        System.out.println(ok ? "Row updated." : "No row found with that surname.");
                        break;

                    case "0":
                        running = false;
                        System.out.println("Goodbye.");
                        break;

                    default:
                        System.out.println("Invalid choice, try again.");
                }
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage()
                        + " (is data.xlsx closed in Excel?)");
            }
        }
        sc.close();
    }
}