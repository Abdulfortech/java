public class Q1_2023 {
    public static void main(String[] args) {
        // Declare an array of 50 integers(YOU DONT HAVE TO WRITE THE COMMENT)
        int[] numbers = new int[50];

        // Initialize the array: each element is the square of its index(YOU DONT HAVE TO WRITE THE COMMENT)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }

        // Compute the sum and average of the elements(YOU DONT HAVE TO WRITE THE COMMENT)
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        // Count percentages(YOU DONT HAVE TO WRITE THE COMMENT)
        int equalToAverage = 0, belowAverage = 0, aboveAverage = 0;
        for (int num : numbers) {
            if (num == average) {
                equalToAverage++;
            } else if (num < average) {
                belowAverage++;
            } else {
                aboveAverage++;
            }
        }

        double percentageEqual = (equalToAverage / 50.0) * 100;
        double percentageBelow = (belowAverage / 50.0) * 100;
        double percentageAbove = (aboveAverage / 50.0) * 100;

        // Display the results(YOU DONT HAVE TO WRITE THE COMMENT)
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of elements: " + average);
        System.out.printf("Percentage Equal: %.2f%%\n", percentageEqual);
        System.out.printf("Percentage Below: %.2f%%\n", percentageBelow);
        System.out.printf("Percentage Above: %.2f%%\n", percentageAbove);
    }
}
