import java.util.Scanner;

/**
 * Created by Mo Tazrian on 2/3/18.
 */
public class MidtermReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String textEntered = scan.nextLine();

        while (textEntered.isEmpty() || textEntered == null) {
            System.out.println("Please enter a valid string, empty and null strings are not accepted:");
            textEntered = scan.nextLine();
        }
        scan.close();

        MidtermReverseString output = new MidtermReverseString();
        String reverseCharacters = output.reverseText(textEntered);
        System.out.println(reverseCharacters);
    }

    private String reverseText(String originalText) {
        String reverse = "";

        for (int i = originalText.length() - 1; i >= 0; i--) {
            reverse = reverse + originalText.charAt(i);
        }
        return reverse;

    }
}
