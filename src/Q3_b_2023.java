public class Q3_b_2023 {
    public static void mathArithOperation(int opr1, int opr2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = opr1 + opr2;
                break;
            case '-':
                result = opr1 - opr2;
                break;
            case '*':
                result = opr1 * opr2;
                break;
            case '/':
                if (opr2 != 0) {
                    result = opr1 / opr2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println(opr1 + " " + op + " " + opr2 + " is " + result);
    }

    public static void main(String[] args) {
        mathArithOperation(2, 3, '+'); // Example: 2 + 3
        mathArithOperation(10, 5, '-'); // Example: 10 - 5
    }
}
