import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
        int remainder = number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Taking input of the number and the divisor
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        // calling the function to get the array containing the quotient and remainder
        int[] arr = findRemainderAndQuotient(number,divisor);

        System.out.println("The quotient is "+arr[0] + " and the Remainder is "+arr[1]);
    }
}
