import java.util.Scanner;
public class SpringSeason {
    // Boolean function to check weather the date is spring or not
    public static boolean checkSpring(int month, int date){
        if(month == 3){

            if(date>=20)
                return true;
            else
                return false;
        }
        else if (month >3 && month < 6)
            return true;
        else if(month == 6){
            if(date <= 20)
                return true;
            else
                return false;

        }
        return false;
    }
    public static void main(String[] args){
        //created a scanner to take the input
        Scanner sc = new Scanner(System.in);
        // Crated two variable to take input of month and date
        int month = sc.nextInt();
        int date = sc.nextInt();
        // Calling the function to check the month is sprint or not
        boolean flag = checkSpring(month,date);
        if(flag)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");


    }
}
