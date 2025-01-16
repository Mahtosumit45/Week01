import java.util.*;
public class QuotientRemainder{
    public static void main(String[] args){
        // Create a scanner
        Scanner sc = new Scanner(System.in);
        // Created two variable to store number 1 and number 2
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Displaying the output

        System.out.println("The Quotient is "+(num1/num2) + " and Reminder is " +(num1%num2) +" of two number "+num1 +" and "+num2);
    }
}

