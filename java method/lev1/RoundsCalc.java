import java.util.*;
import java.lang.Math;
public class RoundsCalc{
    
    public static double rounds(int totalRun, int perimeter){
        return (double)totalRun/perimeter;


    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Taking the input of threee sides of traingle
        System.out.println("Enter length of three sides in meter"); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // calculating the perimeter of the trianglular park
        int perimeter = a+b+c;

        // Calculate the number of rounds 
        double answer = rounds(5000,perimeter);

        // Printing the outputs
        System.out.println("The athlete will take "+String.format("%.2f",answer)+" rounds to complete 5 km run");
    }
}


