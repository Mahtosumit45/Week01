import java.util.*;
public class IsSpring{
    public static void main(String[] args){

        // Take the input of month and date
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // March = 3 June = 6
        boolean flag  = false;
        if(month == 3 && day >=20)
            flag = true;
        if(month > 3 && month < 6)
            flag = true;
        if(month == 6 && day <= 20)
            flag = true;
        if(flag)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

