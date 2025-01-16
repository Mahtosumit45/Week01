import java.util.*;
public class WhileCountdown{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        //Take the input of the number
        int num = sc.nextInt();
        while(num >=1){
            System.out.println(num);
            num--;
        }
    }
}

