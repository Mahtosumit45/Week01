import java.util.*;
public class MultiplicationTable{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Storing 1 to 10 inside an array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // Created a varible to user input
        int num = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            System.out.println(num+" * "+arr[i] +" = "+(num*arr[i]));
        }
    }
}

