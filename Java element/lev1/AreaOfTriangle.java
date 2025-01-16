import java.util.*;
public class AreaOfTriangle{
    public static void main(String[] args){
        // Create a Scanner sc
        Scanner sc = new Scanner(System.in);
        // get the input of height and base of triangle
        int height = sc.nextInt();
        int base = sc.nextInt();
        // Calculate the Area in Inch 
        double area = 1.5 * height*base;
        // Convert  Area into Cm 
        double areaInCmsq = area * 2.54 *2.54;

        //Display the output
        System.out.println("Area of Triangle in Inch^2 is " + area +" and in Cm^2 is "+ areaInCmsq);
    }
}

