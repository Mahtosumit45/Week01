import java.util.*;
public class choco{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created two variable to store the number numberofchoco and numberofchildre
        int numberOfChoco=sc.nextInt();
    
        int numberOfChildren = sc.nextInt();

        // Displaying output
        System.out.println("The number of chocolates each child gets is "+(numberOfChoco / numberOfChildren) +" and the number of remaining chocolates are "+(numberOfChoco % numberOfChildren));
    }
}

