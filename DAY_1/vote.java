import java.util.*;
public class vote {
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("\u001B[35m" + "Enter your age : " + "\u001B[0m");
    int age = sc.nextInt();
    if (age>=18){ 
        System.out.println("You can vote");}
        else{
            System.out.println(" You cannot vote");
        }
}    
}
