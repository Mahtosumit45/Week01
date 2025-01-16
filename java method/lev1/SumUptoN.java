import java.util.Scanner;
public class SumUptoN {
    public static int calculate(int n){
        int sum = 0;
        while(n > 0){
            sum+=n;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
       // Created a scanner for inputs
       Scanner sc = new Scanner(System.in);
       // created a variable to take input
        int num = sc.nextInt();
        // calling the calculate function to store the sum upto n
        int sum = calculate(num);
        System.out.println("The sum upto "+num+" is "+sum);
    }
}