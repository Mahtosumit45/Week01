import java.util.*;
public class FeetToYard{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created a int variable to store the Distance in Feet
        int distanceInFeet = sc.nextInt();
        double totalYard = distanceInFeet / 3.0;
        double totalmiles = totalYard / 1760;

        //Display the output
        System.out.println("The distance in yard is "+String.format("%.2f",totalYard)+" and in miles is "+String.format("%.2f",totalmiles));
    }
}



