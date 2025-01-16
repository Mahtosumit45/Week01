import java.util.Scanner;

public class CompareString {
    public static boolean isSameString(String s1, String s2){
       if(s1.compareTo(s2) == 0)
           return true;

       return false;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().trim();
        String s2 = sc.next().trim();
        if(isSameString(s1,s2))
            System.out.println("YES both strings are same");
        else
            System.out.println("NO strins are not same");
    }
}
