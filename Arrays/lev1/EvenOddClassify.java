import java.util.*;
public class EvenOddClassify{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Create a variable to store the number input
        int num = sc.nextInt();
        if(num > 0){
            // Creating two array to store the even and odd numbers
            int[] even = new int[(num/2)+1];
            int[] odd = new int[(num/2)+1];
            int evenptr = 0;
            int oddptr = 0;
            for(int i =1;i<=num;i++){
                if(i %2 == 0){
                    even[evenptr] = i;
                    evenptr++;
                }
                else{
                    odd[oddptr] = i;
                    oddptr++;
                }
            }
            //Printing the odd and even arrays
            System.out.println("Even Numbers are::");
            for(int it:even)
                System.out.println(it);
            System.out.println("Odd Numbers are:: ");
            for(int it: odd)
                System.out.println(it);

        }
        else
            System.out.println("please enter a natural number");
    }
}


