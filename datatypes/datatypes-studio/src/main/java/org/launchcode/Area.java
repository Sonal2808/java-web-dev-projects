package org.launchcode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double A;
        double r;
        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.println("Enter the radius: ");
                r = input.nextDouble();

                if (r <= 0) {
                    System.out.println("Radius must be a positive value.");
                } else {
                    A = 3.14 * r * r;
                    System.out.println("Area of circle: " + A);
                    break;  // Exit the loop if valid input and calculation are done
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                input.nextLine();  // Clear the invalid input from the scanner
            }
        } while (true);

        input.close();
    }
}
