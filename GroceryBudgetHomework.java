import java.util.Scanner;

/**
 * Created by Mo Tazrian on 12/12/17.
 */

/**
 * Build a grocery budget system using while loop
 * User can purchase as many item he wishes within the budget limit of $100.00
 * IF the purchased amount exceeds the budget amount, notify the user with appropriate message
 * you must spend all of budget amount
 * Make sure to test your code and avoid possible bugs.
 */

public class GroceryBudgetHomework {

    public static void main(String[] args) {

//        Scanner and variables declared.
        Scanner enterPrice = new Scanner(System.in);
        double budgetRemaining = 100, itemPrice;


//        While loop to force user to continue purchasing until entire budget is used.
        while (budgetRemaining > 0) {
            System.out.println("You have a remaining budget of $" + budgetRemaining + ". Please enter price of item:");
            itemPrice = enterPrice.nextDouble();

//            Pre-condition to avoid bug where budgetRemaining goes up in the case that user enters negative number.
            if (itemPrice < 0) {
                System.out.println("Sorry, you have entered an invalid amount. ");
                continue;
            }

//            Error message in the case that user enters price which is higher than budgetRemaining.
            if (itemPrice > budgetRemaining) {
                System.out.println("Sorry, your item exceeds your budget.");
                continue;
            }

//            Main purpose of program is to subtract itemPrice from budgetRemaining.
            budgetRemaining -= itemPrice;
        }


//        When budgetRemaining is depleted, print message.
        System.out.println("You have reached your maximum budget. Thank you for shopping with us!");
    }
}