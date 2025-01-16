import java.lang.Math;
import java.util.Scanner;

public class Trigonometric {
    public double[] calculateTrigonometricFunctions(double angle){
        double radian = Math.toRadians(angle);
        double sineValue = Math.sin(radian);
        double cosineValue = Math.cos(radian);
        double tangentValue = Math.tan(radian);
        return new double[]{sineValue,cosineValue,tangentValue};
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Take the input of the angle
        double angle = sc.nextInt();
        // Calculating the sine,cos,tan using the function
        Trigonometric tc = new Trigonometric();
        double[] arr = tc.calculateTrigonometricFunctions(angle);
        double sineValue = arr[0];
        double cosValue = arr[1];
        double tanValue = arr[2];

        System.out.println(" Sine value = "+sineValue);
        System.out.println(" Cosine value = "+cosValue);
        System.out.println(" Tangent value = "+tanValue);


    }
}
