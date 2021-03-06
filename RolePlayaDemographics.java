/* File: GatherDemographics.java
 * Author: Travis "Kent" Graves
 * Date: 23-01-2015
 * Purpose: Gathers demographic information from a player
 */

// List imports
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class GatherDemographics {

    public static void main(String [] args) {

        // Declare variables
         String nameOfMonth = null;
         int yearOfBirth;
         int dayOfBirth;
         int birthMonth;
         double latLoc;
         double longLoc;
         float gpaAverage;

        // Declare scanner class for userInput
        Scanner userInput = new Scanner(System.in);

        // Get day user was born
        System.out.print("Enter the day you were born [1-31]: ");
        dayOfBirth = userInput.nextInt();

        if ((dayOfBirth < 1) || (dayOfBirth > 31)) {
            System.out.println("Invalid day of the month!");
            System.exit(1);
        }

        // Get month user was born
        System.out.print("Enter the month you were born [1-12]: ");
        birthMonth = userInput.nextInt();

        // Validate input
        if ((birthMonth <= 0) || ( birthMonth > 12)) {
            System.out.println("Invalid month!");
            System.exit(1);
        } // End of if statement

        // convert month number to alphabetic month name
        switch (birthMonth) {
            case 1:
                nameOfMonth = "January"; 
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default: 
                System.out.println("Invalid month!");
                System.exit(1);
                break;
        } // End Switch

        // Get year user was born
        System.out.print("Enter the year you were born [1900-2014]: ");
        yearOfBirth = userInput.nextInt();

        if ((yearOfBirth > 2014) || (yearOfBirth < 1900)) {
            System.out.println("Invalid year!");
            System.exit(1);
        }

        // Get users lattitude location
        System.out.print("Enter the lattitude of your home address: ");
        latLoc = userInput.nextDouble();

        // Get users longitude location
        System.out.print("Enter the longitude of your home address: ");
        longLoc = userInput.nextDouble();

        // Get users GPA
        System.out.print("Enter your current GPA: ");
        gpaAverage = userInput.nextFloat();

        // Finished survey. Echoing data back to user
        System.out.println("\nThank you for taking this survey!!\nYou have entered the following data:");

        System.out.println("You were born " + nameOfMonth + " " + dayOfBirth + " " + yearOfBirth + ".");

        System.out.println("You live at the address: " + latLoc + " x " + longLoc);

        System.out.println("Your GPA is: " + gpaAverage);
        
    } // End of Main
} // End of GatherDemographics Class