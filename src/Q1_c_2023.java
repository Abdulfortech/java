//Public class ClassA {
//    public static void method1 () {
//        double x  = 1.87;
//        int y = x;
//        Method2();
//    }
//
//    public void method2(){
//        System.out.println('Ina kwana');
//        return 0;
//    }
//}


/* the errors
 1. Incorrect capitalization in Public:
        Java keywords are case-sensitive. Use public instead of Public.
 2. Type mismatch in int y = x:
        x is a double, and assigning it directly to an int without casting results in a type mismatch error.
        Solution: Explicitly cast x to int: int y = (int) x;.
 3. Calling Method2 incorrectly:
        Method names are case-sensitive. Use method2() instead of Method2().
 4. Invalid return type in method2:
        method2 is declared void but attempts to return a value (0). Change void to int or remove the return 0;.
 5. Invalid single quotes for String in System.out.println:
        Use double quotes for String literals: "Ina kwana".
*/
