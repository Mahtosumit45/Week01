import java.util.Scanner;

public class Chocolate {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
        int remainder = number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // taking input of the chocolates and children
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Using the same function to get the distributed and remaining chololates
        int[] arr = findRemainderAndQuotient(n,m);
        System.out.println("The number of Chocolate each children have "+arr[0]+" and remaining chocolates are "+arr[1]);

    }
}
