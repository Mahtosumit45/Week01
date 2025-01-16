import java.util.*;
public class HeightConverter{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created a int variable to take input of height in cm
        int heightInCm = sc.nextInt();
        // Converted cm to inch
        double heightInInch = heightInCm / 2.54;
        // Converted heigh in inch to only feets
        int heightInFeet = (int) (heightInInch/12);
        // Remaining height in inch
        int remaining = (int) (heightInInch % 12);
        // Display the output
        System.out.println("Your height in cm is "+heightInCm +" while in feet is "+heightInFeet +" and in inch is "+remaining);
    }
}

