import java.util.*;
public class FactorialWhile{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        int factorial = 1;
        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        // Calculate the factorial using while loop
        while(num >= 1){
            factorial *= num;
            num--;
        }
        System.out.println("The factorial of number is "+factorial);


    }
}



