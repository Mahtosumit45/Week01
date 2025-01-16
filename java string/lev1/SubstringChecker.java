import java.util.Scanner;

public class SubstringChecker {
    public static String subString1(String str) {
        String result = String.valueOf(str.charAt(2)) + String.valueOf(str.charAt(3)) + String.valueOf(str.charAt(4)) + String.valueOf(str.charAt(5));

        return result;
    }
    public static String subString2(String str){
        return str.substring(2,6);
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();

        String substr1 = subString1(s);
        System.out.println(substr1);
        String substr2 = subString2(s);
        System.out.println(substr2);
        if(substr2.equals(substr1))
            System.out.println("Yes both substrings are same");
        else System.out.println("No both substrings are not same");
    }
}
