import java.util.*;
public class IsNatural{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Take input of 3 numbers
        int num = sc.nextInt();
        int temp = num;
        // Check if the number is natural

        if(num > 0){
            int sum = 0;
            while(num > 0){
                sum += num;
                num = num -1;
            }
            System.out.println("The sum of "+temp+" natural number is " + sum);
        }
        else{
            System.out.println("The number "+temp+"is not a natural number");
        }
    }
}


