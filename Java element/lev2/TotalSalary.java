import java.util.*;
public class TotalSalary{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created two variable to store salary and bonus from user
        int salary = sc.nextInt();
        int bonus = sc.nextInt();
        //Displaying the output
        System.out.println("The Salary is INR "+salary+" and bonus is INR "+bonus+". Hence total salary is INR "+(salary+bonus));

    }
}



