import java.util.*;
public class CanVote{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Take input of 3 numbers
        int age = sc.nextInt();


        // Check if the person can vote or not
        if(age >= 18)
            System.out.println("The person can vote");
        else
            System.out.println("The person cannot vote");


    }
}


