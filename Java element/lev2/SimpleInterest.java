import java.util.*;
public class SimpleInterest{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        /* Created three variable to take the input of priciple , rate
         * and time period */
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        // calculation of simple interest
        double SimpleInterest = (principle * time * rate) / 100;
        
        // Display the outputs
        System.out.println("The Simple Interest is "+SimpleInterest+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);
    }
}



