import java.util.*;
public class PNZ{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Take input of  number
        int num = sc.nextInt();
    
        //Check if the number is Zero, postive or negative
        if(num == 0)
            System.out.println("Zero");
        else if(num > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}



