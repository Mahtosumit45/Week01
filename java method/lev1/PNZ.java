import java.util.Scanner;

public class PNZ {
    public static void checker(int n){
        if(n == 0)
            System.out.println("Zero");
        else if(n > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    public static void main(String[] args){
        // Creating a scanner to take the input
        Scanner sc = new Scanner(System.in);
        // Crating a variable to take user input
        int num = sc.nextInt();
        // calling the function to check the number is zero positive of negative
        checker(num);



    }
}