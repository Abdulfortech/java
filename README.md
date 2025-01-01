Java practicing project

## Precedence and Associativity 
Precedence and associativity are concepts in programming that define how operators are evaluated in expressions.

### Operator Precedence
Operator precedence determines the order in which different operators in an expression are evaluated. Operators with higher precedence are evaluated before operators with lower precedence.

<b>For example:</b>

int result = 10 + 2 * 3; // result = 10 + (2 * 3) = 10 + 6 = 16
Here, the multiplication operator (*) has higher precedence than the addition operator (+).

### Operator Associativity
Associativity defines the direction in which operators of the same precedence level are evaluated. Associativity can be either:

Left-to-right (Left Associative): Most operators, like addition (+), subtraction (-), multiplication (*), and division (/), are evaluated from left to right.
Right-to-left (Right Associative): Some operators, like assignment (=) and the conditional (?:), are evaluated from right to left.

<b>For example: </b>

<code>
    int x = 5;
    int y = 10;
    int z = x = y; // Right-to-left associativity
    // First y is assigned to x, then the result (10) is assigned to z.
</code>

## Type casting 
Type casting in programming refers to converting a variable from one data type to another. This is often required when working with variables of different types in expressions or assignments. Type casting can be either implicit (automatically handled by the compiler) or explicit (manually specified by the programmer).

### 1. Implicit Type Casting (Type Promotion)
   Implicit casting, or widening casting, occurs when the compiler automatically converts a smaller data type to a larger one. This is safe and doesn't lose precision.

<b>Example in Java:</b>

<code>
    int intVal = 42;
    double doubleVal = intVal; // Implicit casting (int to double)
    System.out.println(doubleVal); // Outputs: 42.0
</code>

In this case, the integer value 42 is automatically converted to a double.

### 2. Explicit Type Casting
   Explicit casting, or narrowing casting, is required when converting a larger data type to a smaller one. It may result in data loss or truncation and needs to be explicitly specified by the programmer.

datatype variable = (datatype) value;

<b>Example in Java:</b>

<code>
    double doubleVal = 42.75;
    int intVal = (int) doubleVal; // Explicit casting (double to int)
    System.out.println(intVal); // Outputs: 42
</code>

Here, the fractional part .75 is truncated during the conversion.

