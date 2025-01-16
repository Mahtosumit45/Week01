import java.util.*;
public class KmtoMiles{
    public static void main(String[] args){
        // Create a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Create a int variable and take the user input
        int distanceInKm = sc.nextInt();

        // Create and calculate the input into miles
        double distanceInMiles = distanceInKm * 1.6;

        // Display the output
        System.out.println("The total miles is "+distanceInMiles +" mile for given "+distanceInKm+" km");
    }
}

