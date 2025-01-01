import java.util.Scanner;

public class controlStructures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        **** Grading using switch
//        System.out.println("Enter your mark : ");
//        Integer mark = input.nextInt();
//        String grade = "";
//        switch (mark / 10) {
//            case 10 :
//            case 9:
//                grade = "A";
//                break;
//            case 8 :
//                grade = "B";
//                break;
//            case 7 :
//                grade = "C";
//                break;
//            case 6 :
//                grade = "D";
//                break;
//            case 5 :
//                grade = "E";
//                break;
//            default :
//                grade = "F";
//                break;
//        }
//
//        System.out.println("yOUR GRADE IS : " + grade);
//
//        ****grading using else-if
//        System.out.println("Enter your grade:");
//        int mark = input.nextInt();
//        String grade = "";
//        if(mark < 40)
//        { grade = "F"; }
//        else if (mark < 45)
//        { grade = "E"; }
//        else if (mark < 50)
//        { grade = "D"; }
//        else if (mark < 60)
//        { grade = "C"; }
//        else if (mark < 70)
//        { grade = "B"; }
//        else
//        { grade = "A"; }
//
//        System.out.println("your grade is " + grade);

//        ****using while condition
//        int counter = 100;
//        while (counter < 200)
//        {
//            counter++;
//            System.out.println(counter);
//        }

//        **** write a program that print even numbers between 1-1million inclusive and sum the and all the even intgeers and all the odd integers
//         int i = 1; int sumEven = 0; int sumOdd = 0;
//         while(i < 1000000)
//         {
//             if(i%2 == 0)
//             {
//                 System.out.print(i + ", ");
//                 sumEven += i;
//             }else
//             { sumOdd += i;}
//             i++;
//         }
//        System.out.println("sum of even numbers: " + sumEven );
//        System.out.println("sum of odd numbers: " + sumOdd );

//        **** for loops
        int results = 1;
        for (int i = 100; i >= 1; i--) {
            results = results * i;
        }
        System.out.println("The result is :" + results);
    }
}
