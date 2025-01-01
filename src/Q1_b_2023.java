import java.util.Scanner;

public class Q1_b_2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence of at least 100 characters:");
        String sentence = input.nextLine();

        if (sentence.length() < 100) {
            System.out.println("Error: The sentence must be at least 100 characters long.");
            return;
        }

        // (i) Count occurrences of 'a', 'e', and 'o'(YOU DONT HAVE TO WRITE THE COMMENT)
        int countA = 0, countE = 0, countO = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == 'a') countA++;
            if (c == 'e') countE++;
            if (c == 'o') countO++;
        }
        System.out.println("Occurrences of 'a': " + countA);
        System.out.println("Occurrences of 'e': " + countE);
        System.out.println("Occurrences of 'o': " + countO);

        // (ii) Reverse the sentence with characters separated by '_' (YOU DONT HAVE TO WRITE THE COMMENT)
        StringBuilder reversed = new StringBuilder();
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed.append(sentence.charAt(i)).append("_");
        }
        System.out.println("Reversed Sentence: " + reversed.toString().substring(0, reversed.length() - 1));

        // (iii) Capitalize characters at even positions (YOU DONT HAVE TO WRITE THE COMMENT)
        StringBuilder capitalized = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ((i + 1) % 2 == 0) {
                capitalized.append(Character.toUpperCase(c));
            } else {
                capitalized.append(c);
            }
        }
        System.out.println("Capitalized Sentence: " + capitalized);

        // (iv) Display words containing 'o' or 'u' (YOU DONT HAVE TO WRITE THE COMMENT)
        System.out.println("Words containing 'o' or 'u':");
        for (String word : sentence.split(" ")) {
            if (word.toLowerCase().contains("o") || word.toLowerCase().contains("u")) {
                System.out.println(word);
            }
        }
    }
}
