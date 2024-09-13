public class Multiples {
    public static void main(String[] args) {
        int count = 0;  // Variable to store the count of multiples

        // Loop through all numbers from 0 to 999
        for (int i = 0; i < 1000; i++) {
            // Check if the number is divisible by 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                count++;  // Increment the count
            }
        }

        // Print the result
        System.out.println("The number of multiples of 3 or 5 below 1000 is: " + count);
    }
}

