import java.util.*;
public class Swapper{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created two variable to store number one and two
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        // Displaying the output
        System.out.println("The Swapped number are "+number1+" and "+number2);
        
    }
}




