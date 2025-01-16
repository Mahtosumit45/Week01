import java.util.*;
import java.lang.Math;

public class DigitFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input of the number of students
        System.out.println("enter the number");
        int num = sc.nextInt();

        //Created an array to store the frequency of each digit
        int[] arr = new int[10];
        int temp = num;
        while(temp>0){
            int digit = temp%10;
            arr[digit]++;
            temp  /= 10;
        }
        // Printing the frequency of each digits
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0)
                continue;
            System.out.println("The frequency of digit "+i+" is "+arr[i]);
        }
        

    }
}

    
