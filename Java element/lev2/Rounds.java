import java.util.*;
public class Rounds{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Taking input of the side of triangle
        System.out.println("Enter the side of Triangle in meter");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int rounds = 5000/(a+b+c);
        //Displaying the results 
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
}
}





