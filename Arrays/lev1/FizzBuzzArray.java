import java.util.*;
public class FizzBuzzArray{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Create a variable to store the user input
        int num = sc.nextInt();
        String[] arr = new String[num];

        for(int i = 1;i<=num;i++){
            if(i %3 == 0 && i % 5 == 0){
                arr[i-1] = "FizzBuzz";
            }
            else if(i%3 == 0){
                arr[i-1] = "Fizz";
            }
            else if(i%5 == 0){
                arr[i-1] = "Buzz";
            }
            else{
                arr[i-1] = Integer.toString(i);
            }
        }
        // Printing the output
        for(int i =0;i<arr.length;i++){
            System.out.println("Position "+(i+1)+ " = "+ arr[i]);
        }
    }
}

