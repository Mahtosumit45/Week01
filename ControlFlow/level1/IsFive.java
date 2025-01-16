import java.util.*;
public class IsFive{
    public static void main(String[] args){
        // Created a Scanner for taking inputs 
        Scanner sc = new Scanner(System.in);
        // Created a variable to take input of number from user
        int num = sc.nextInt();
        boolean flag = false;
        //Cheching if number is divide by 5
        if(num%5 == 0){
            flag = true;
        }
        System.out.println("Is the number "+num+" divisible by 5 ?"+flag);
    }
}


