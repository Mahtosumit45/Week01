import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPali(String s){
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;

        }
        return true;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next().trim();
        if(isPali(s)){
            System.out.println("Yes its a palindrome  string");
        }
        else
            System.out.println("NO its not a palindrome string");
    }
}
