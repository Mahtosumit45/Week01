import java.util.Scanner;

public class SumOfN {
    public static int SumR(int num){
        if(num == 1) return 1;
        return num + SumR(num-1);
    }
    public static int Sum(int num){
        return (num*(num+1))/2;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Taking input of number
        int num = sc.nextInt();
        // Calling both function to get the values
        int sum1 = SumR(num);
        int sum2 = Sum(num);
        if(sum1 == sum2)
            System.out.println("Yes both are same");
        else
            System.out.println("No both are different");
    }
}
