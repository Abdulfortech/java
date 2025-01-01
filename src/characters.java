import java.util.Scanner;

public class characters {
    public static void main(String[] args) {
//        String firstName = "Abdullahi";
//        String lastName = "AMINU";
//        char first = 'A';
//        char space = ' ';
//        char last = 'b';
//
//
//        System.out.println(Character.isLetter(first));
//        System.out.println(Character.isWhitespace(space));
//        System.out.println(Character.isLowerCase(first));
//        System.out.println(Character.isUpperCase(first));
//        System.out.println(Character.isLetterOrDigit(first));
//        System.out.println(Character.toLowerCase(first));
//        System.out.println(Character.toUpperCase(last));

//        **** write a program to that reads in and count the number of character, whitespace and number is a string
//        Scanner input = new Scanner(System.in);
//        String s;
//        System.out.println("Please enter a string: ");
//        s = input.nextLine();
//        int countL = 0 ; int countD = 0; int countS = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char a  = s.charAt(i);
//            if(Character.isLetter(a)) {countL++;}
//            if(Character.isDigit(a)) { countD++;}
//            if(Character.isWhitespace(a)) { countS++;}
//        }
//
//        System.out.println("Letters : " + countL);
//        System.out.println("Digits : " + countD);
//        System.out.println("Whitespaces : " + countS);

//        **** write a program that reads in a string ,and output it in reverse capitalizing all the elements
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Please enter a string: ");
        s = input.nextLine();
        for (int i =  s.length() -1 ; i >= 0; i--) {
            char a  = s.charAt(i);
            if((i+1)%2 == 0)
            {
                System.out.println(Character.toUpperCase(a));
            }
            else
            {
                System.out.println(Character.toLowerCase(a));
            }
        }
    }
}
