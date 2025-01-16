import java.util.Scanner;

public class Numbers {
    public static int compare(int[] arr){
        int first = arr[0];
        int last = arr[arr.length-1];
        if(first == last)
            return 0;
        else if(first > last)
            return 1;
        return -1;

    }
    public static boolean isEven(int num){
        if(num%2 == 0) return true;
        return false;
    }
    public static boolean isPositive(int num){
        return num>0;

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Array to store the numbers
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if(isPositive(arr[i])){
                if(isEven(arr[i]))
                    System.out.println("The number "+arr[i] +" is positive and even");
            }
        }
        int flag = compare(arr);
        if(flag == 1)
            System.out.println("Greater");
        else if(flag == 0)
            System.out.println("Equal");
        else
            System.out.println("Less");
    }
}
