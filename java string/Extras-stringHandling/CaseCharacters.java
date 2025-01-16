import java.util.Scanner;

public class CaseCharacters {
    public static String toggleCharacters(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
               ans+=String.valueOf((char)(ch+32));
            }
            else{
                ans+=String.valueOf((char)(ch-32));
            }

        }
        return ans;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next().trim();
        String toggledS = toggleCharacters(s);
        System.out.println("The String after toggling the character = "+toggledS);
    }
}
