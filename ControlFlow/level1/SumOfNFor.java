import java.util.*;
public class SumOfNFor{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        int temp = num;
        for(int i = 1;i<=num;i++){
            sum1+=i;
        }
        int sum2 = (temp*(temp+1)) / 2;
        if(sum1 == sum2)
            System.out.println("Yes both the sum are equal");
        else
            System.out.println("No both sum are different");
    }
}



