import java.util.*;
public class MultiplicationTable{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();

        if(num >= 6 && num <= 9){
            for(int i = 1;i<=10;i++){
                System.out.println(num+ " * "+i+" = " +(i*num));
            }
        }

        
    }
}




