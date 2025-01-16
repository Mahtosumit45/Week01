import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        String reversed ="";
        for(int i =s.length()-1;i>=0; i--){
            char ch = s.charAt(i);
            reversed+=String.valueOf(ch);

        }
        return reversed;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s =sc.next();
        String reversedS = reverseString(s);
        System.out.println("The reveresed String is = "+reversedS);
    }
}
