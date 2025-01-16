import java.util.*;
public class Numbers{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Creating an Array of size 10 to store age of 10 students
        int[] numbers = new int[5];
        System.out.println("Enter the numbers: ");
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        // Use loop to check the positive negative or zero of each number
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] > 0)
                System.out.println("Positive");
            else if(numbers[i]<0)
                System.out.println("Negative");
            else
                System.out.println("Zero");

        }
    }
}

