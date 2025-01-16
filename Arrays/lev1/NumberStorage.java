import java.util.*;
public class NumberStorage{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Creating an Array to store the user inputs upto 10 numbers;
        int[] arr = new int[10];
        // Created a sum variable to store sum of elements
        int sum = 0;
        System.out.println("Enter the numbers ");
        for(int i = 0;i<arr.length;i++){

            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;

            sum+= arr[i];
        }
        for(int it: arr){
            System.out.print(it+" ");
        }
        System.out.println("\n Sum of all the elements entered is "+sum);
    }
}

