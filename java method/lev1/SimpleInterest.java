import java.util.*;
import java.lang.Math;
public class SimpleInterest{
    public static double simpleInterest(int principal , int rate, int time){
        return (double)((principal * rate * time)/100);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // taking input of the principal , rate and interest
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        // calling simple interest method to calculate
        double SI = simpleInterest(principal, rate, time);
        //Printing the outputs
        System.out.println("The simple interest is "+SI+" for Principal "+principal+" , Rate of Interest "+rate+" and Time "+time);
    }
}


