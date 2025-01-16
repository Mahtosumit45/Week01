import java.util.Scanner;

public class LengthUsingLoop {
    public static int lengthString(String s){
        int count  = 0;
        int id = 0;
        while (true){
            try{
                s.charAt(id);
                id++;
                count++;
            }
            catch (Exception e){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        // Created a scanner for inputs

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.next().trim();
        System.out.println("The string length using the user defined function  = "+lengthString(s));
        System.out.println("The string length using the built in function  = "+s.length());
    }
}
