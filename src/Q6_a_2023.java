import java.util.Scanner;

public class Q6_a_2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome: ");
        String original = input.nextLine();

        String processed = original.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(processed).reverse().toString();

        if (processed.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}
