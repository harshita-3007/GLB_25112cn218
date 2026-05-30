public class sumofdigits {
    public static void main(String[] args) {
        int number = 12345; 
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;
            number /= 10; 
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
