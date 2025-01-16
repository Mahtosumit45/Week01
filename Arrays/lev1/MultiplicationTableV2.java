import java.util.*;
public class MultiplicationTableV2{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Creating an Array to store the multiplication table
        int[] arr = new int[10];
        // Created a variable to store the user input of number
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num >=6 && num <= 9){
            for(int i = 1;i<=10;i++){
                arr[i-1] =num*i;
            }
        }
        else
            System.out.println("Enter the number between 6 and 9");
        // Displaying the multiplication table from the array
        System.out.println("Multiplication table of "+num+" is :");
        for(int it: arr){
            System.out.println(it);
        }
    }
}


