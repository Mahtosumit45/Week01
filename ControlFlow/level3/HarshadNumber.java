import java.util.*;
import java.lang.Math;
public class HarshadNumber{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        int temp = num;
        int sumOfDigits = 0;
        // Calculate the sum of digits using while loops
        while(num > 0){
            sumOfDigits += (num%10);

            num /= 10;
        }
        // Check if the number is divided by the sum of its digits
        if(temp % sumOfDigits == 0)
            System.out.println("Yes its a Harshad Number");
        else
            System.out.println("No its not a Harshad Number ");
        
    }
}







