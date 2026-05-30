public class productofdigits {
    public static void main(String[] args) {
        int number = 12345; 
        int product = 1;

        // Calculate the product of digits
        while (number > 0) {
            int digit = number % 10; 
            product *= digit;
            number /= 10; 
        }

        System.out.println("The product of the digits is: " + product);
    }
}