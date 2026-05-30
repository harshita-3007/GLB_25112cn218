import java.util.*;
public class inputsum {
    public static void main(String[] args) {
        // nextInt() - to take integer input
        // next() - to take string input (single word)
        // nextLine() - to take string input (multiple words)
        // nextDouble() - to take double input
        // nextFloat() - to take float input
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[105m" + "Enter first number : " + "\u001B[0m");
        int a = sc.nextInt();
        System.out.println("\u001B[106m" + "Enter second number : " + "\u001B[0m");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("\u001B[102m" + "The sum is : " + sum + "\u001B[0m");
    }
}
