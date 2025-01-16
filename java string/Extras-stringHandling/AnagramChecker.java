import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();
        Arrays.sort(aCharArray);
        Arrays.sort(bCharArray);

        for(int i = 0;i<aCharArray.length;i++){
            if(aCharArray[i] != bCharArray[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings seperated by space ");
        String a = sc.next().trim();
        String b = sc.next().trim();

        if(isAnagram(a,b))
            System.out.println("Yes both the strings are anagram");
        else
            System.out.println("No they are not anagram");
    }
}
