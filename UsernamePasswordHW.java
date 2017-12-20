/**
 * Created by Mo Tazrian on 12/16/17.
 */

import java.util.Scanner;

/**
 * Homework:
 * Create a system that checks valid username and password
 * And if they both are valid then only system displays homepage
 * User can only try upto 5 times with invalid login details
 * if it reaches 5 times then system should be locked for 10 min
 */

public class UsernamePasswordHW {

    public static void main (String [] args ) {

//        Declared valid expected username & password values.
        String expectedUsername = "mo";
        String expectedPassword = "pass";
        String enteredUsername, enteredPassword;

        Scanner scan = new Scanner(System.in);

//        Ask user to input values.
        System.out.println("Please enter your username: ");
            enteredUsername = scan.nextLine();

        System.out.println("Please enter your password: ");
            enteredPassword = scan.nextLine();

//            For loop to initiate error message if user enters false credentials.
            for (int i = 1; i < 5; i++) {
                if (!enteredUsername.equals(expectedUsername) || !enteredPassword.equals(expectedPassword)) {
                    int triesAllowed = 5 - i;

                    System.out.println("Your username and password doesn't match, you have " + triesAllowed + " more tries.");

                    System.out.println("Please enter a valid username: ");
                    enteredUsername = scan.nextLine();

                    System.out.println("Please enter a valid password");
                    enteredPassword = scan.nextLine();

//                    When user enters false values 5 times, system locks for 10 minutes.
                    if (i == 4) {
                        System.out.println("Your system will be locked for 10 minutes due to maximum tries allowed.");
                    }
                }

//                Else statement when user enters correct values.
                else {
                        System.out.println("Login Successful! Welcome to Home Page.");
                        break;
                    }
            }
    }
}