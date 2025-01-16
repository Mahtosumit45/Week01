import java.util.*;
public class BonusCalc{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take the year of experience and salary input
        System.out.println("enter the year of experience");

        int yoe = sc.nextInt();
        System.out.println("enter the salary");
        int salary = sc.nextInt();
        double bonus = 0.0;
        if(yoe > 5)
            bonus = salary * 0.05;
            
        System.out.println("Total bonus of this employee :"+bonus);
        }
    }

