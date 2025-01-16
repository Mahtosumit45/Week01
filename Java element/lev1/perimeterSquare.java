import java.util.*;
public class perimeterSquare{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created a int variable to store the side fo square from user
        int side = sc.nextInt();
        // Calculate the perimeter
        int perimeter = side * 4;

        // Display the output

        System.out.println("The length of the side is "+side +" whose perimeter is "+perimeter);
    }
}

