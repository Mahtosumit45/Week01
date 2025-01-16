import java.util.*;
public class SumUntilZeroNegative{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        while(num != 0 &&  num > 0){
            sum += num;
            System.out.println("Enter the number");
            int temp = sc.nextInt();
            num = temp;
        }
        System.out.print("The sum of number entered is"+sum);

    }
}


