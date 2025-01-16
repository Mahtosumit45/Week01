import java.util.*;
import java.lang.Math;
public class MaxHandshake{
    
    public static int handshakes(int num){
        return (num * num-1)/2;


    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Taking input of number of person
        int num = sc.nextInt();

        // calculation the number of handshakes using the function - handshakes
        int answer = handshakes(num);
        //printing the outputs
        System.out.println("total number of handshakes possible are " +answer);
    }
}



