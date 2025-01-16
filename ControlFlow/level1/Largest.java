import java.util.*;
public class Largest{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Take input of 3 numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        /* Created three boolean variable to store wheather the number is largest
         * or not */

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if(num1 > num2 && num1 > num3)
            flag1 = true;
        if(num2 > num1 && num2 > num3)
            flag2 = true;
        if(num3 > num1 && num3 > num2)
            flag3 = true;

        // Display the result
        System.out.println("Is the first number the largest? "+flag1);
        System.out.println("Is the second number the largest? "+flag2);
        System.out.println("Is the Third number the largest? "+flag3);

    }
}


