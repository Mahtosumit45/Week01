import java.util.*;
public class Smallest{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Take input of 3 numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Check if the first is smallest
        boolean flag = false;
        if(num1 < num2 && num1 < num3)
            flag = true;
        // Display the result
        System.out.println("Is the first number the smallest? "+flag);
    }
}

