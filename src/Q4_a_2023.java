import java.util.Scanner;
public class Q4_a_2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        int letters = 0, digits = 0, whitespaces = 0;

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                whitespaces++;
            }
        }

        System.out.println("Number of letters: " + letters);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of whitespaces: " + whitespaces);
    }
}
