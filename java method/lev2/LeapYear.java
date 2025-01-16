import java.util.Scanner;

public class LeapYear {
    public static boolean Checker(int year){
        if(year < 1582) return false;
        else{
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Taking input of the year
        int year = sc.nextInt();

        boolean flag = Checker(year);
        if(flag) System.out.println("Its a Leap Year");
        else System.out.println("Not a Leap Year");
    }
}
