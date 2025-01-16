import java.util.*;
import java.lang.Math;
public class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // take the number from the user as input
        long num = sc.nextLong();
        int digitsInNum = (Long.toString(num)).length();
        int[] arr = new int[digitsInNum];
        int [] reversedArr = new int[digitsInNum];
        int id = digitsInNum-1;

        //Storing the number in arr
        while(num > 0){
            arr[id--] = (int)(num%10);
            num /= 10;
        }
        // Reversing the array 
        
        for(int i = 0;i<arr.length;i++){
            reversedArr[i] = arr[arr.length -1 -i];
        }
        //Printing the reversed array
        System.out.print("The reversed number is: ");

        for(int it: reversedArr){
            System.out.print(it);
        }
    }

}





