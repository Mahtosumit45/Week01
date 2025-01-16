import java.util.*;
public class MeanHeight{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Creating an Array to store the Players height
        double[] players = new double[11];
        // Create a variable to store the sum of their height
        double heightSum = 0.0;
        System.out.println("enter the heights of 11 players ");
        for(int i = 0;i<players.length;i++){
            players[i] = sc.nextDouble();
        }
        for(double it :players){
            heightSum += it;
        }
        System.out.println("The mean height is "+String.format("%.2f",(heightSum/11)));

           
    }
}



