import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+(a+b) + (a-b) +(a*b) +" and "+ ((double)a/b));
    }
}

