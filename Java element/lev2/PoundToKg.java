import java.util.*;
public class PoundToKg{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Created a variable to take input of weight in pound
        int weightInPound  = sc.nextInt();

        // display the weight in KG
        System.out.println("The weight of the Person in pound is "+weightInPound+" and in kg is "+(weightInPound * 2.2));
    }
}



