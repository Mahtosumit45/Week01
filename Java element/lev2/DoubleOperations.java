import java.util.*;
public class DoubleOperations{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created 3 variable to store a,b, c
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //Storing the calculation in four variable 
        double answer1 = a + b * c;
        double answer2 = a * b + c;
        double answer3 = c + a / b;
        double answer4 = a % b + c;
        
        // Displaying the output
        System.out.println("The results of Double  operations are" + answer1+ " , "+ answer2+" , " +answer3+ " and "+ answer4);
    }
}


