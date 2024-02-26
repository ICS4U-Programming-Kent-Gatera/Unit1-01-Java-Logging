import java.util.Scanner;

/**
 * My program calculates how many logs can fit on a truck.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-Feb-25
 */

public final class Logging {
    /**
    * Pleases the style checker.
    *
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Calculates how many logs can fit on a truck.
     *
     * @param args args
     */
    public static void main(String[] args) {
        // Initializing Scanner and constants.
        final Scanner in = new Scanner(System.in);
        final double carryCapacity = 1100;
        final double massPerUnit = 20;
        final double defaultSize1 = 0.25;
        final double defaultSize2 = 0.5;
        final double defaultSize3 = 1;
        final double choice1 = 1;
        final double choice2 = 2;
        final double choice3 = 3;
        final double choice4 = 4;
        int logs_amount;
        try {
            // User input Prompt
            System.out.println(
                "Enter number for size\n|1. 0.25m|\t|"
                + "2. 0.5m|\t|3. 1m|\t|4. User Length|");
            // Initializing input choice variable.
            final int userChoice = in.nextInt();
            // First Choice preset.
            if (userChoice == choice1) {
                logs_amount = (int) (
                    carryCapacity / (defaultSize1 * massPerUnit));
                System.out.printf("You can fit %,d\n", logs_amount);
            }
            // Second Choice preset.
            if (userChoice == choice2) {
                logs_amount = (int) (
                    carryCapacity / (defaultSize2 * massPerUnit));
                System.out.printf("You can fit %,d\n", logs_amount);
            }
            // Third choice preset.
            if (userChoice == choice3) {
                logs_amount = (int) (
                    carryCapacity / (defaultSize3 * massPerUnit));
                System.out.printf("You can fit %,d\n", logs_amount);
            }
            if (userChoice == choice4) {
                // Get input of Log length.
                System.out.print("What is the log size (m): ");
                final Double userSize = in.nextDouble();
                // If log length 0 or negative, give error.
                if (userSize > 0) {
                    logs_amount = (int) (
                        carryCapacity / (userSize * massPerUnit));
                    System.out.printf(
                            "You can fit %,d logs on your truck\n",
                            logs_amount);
                } else {
                    System.out.print("Please enter a valid size > 0\n");
                }
            }
        // In case user enters a string.
        } catch (Exception e) {
            System.out.print("Please enter a valid size > 0\n");
        }
        // Closing the Scanner object.
        in.close();
    }
}
