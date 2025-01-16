import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] arr = {number1,number2,number3};
        Arrays.sort(arr);
        return  new int[]{arr[0],arr[2]};

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // taking input of 3 numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] ans = findSmallestAndLargest(num1,num2,num3);
        // ans[0] smallest
        // ans[2] largest
        System.out.println("The smalles number is "+ans[0]+ " and the largest number is "+ ans[1]);


    }
}
