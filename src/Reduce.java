public class Reduce {
    public static void main(String[] args) {
        int n = 100;  // Starting number
        int steps = 0;  // Step counter

        // Loop until n becomes 0
        while (n > 0) {
            if (n % 2 == 0) {
                // If n is even, divide it by 2
                n /= 2;
            } else {
                // If n is odd, subtract 1
                n -= 1;
            }
            steps++;  // Increment step counter
        }

        // Print the number of steps
        System.out.println("The number of steps to reduce 100 to 0 is: " + steps);
    }
}