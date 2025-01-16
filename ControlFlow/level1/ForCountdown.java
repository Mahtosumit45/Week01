import java.util.*;
public class ForCountdown{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        //Take the input of the number
        int num = sc.nextInt();

        for(int i = num;i>=1;i--){
            System.out.println(i);
        }
    }
}


