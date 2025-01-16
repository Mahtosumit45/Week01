import java.util.*;
public class Handshakes{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created a Variable and store the number of student
        int numberOfStu = sc.nextInt();
        int numberOfHandshakes = (numberOfStu * (numberOfStu-1)) / 2;
        System.out.println("The number of handshakes are " + numberOfHandshakes );
    }
}

