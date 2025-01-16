import java.util.Scanner;

public class DuplicateRemove {
    public static String removeDuplicate(String s){
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(!temp.contains(String.valueOf(s.charAt(i)))){
                temp+=String.valueOf(s.charAt(i));
            }

        }
        return temp;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s = sc.next().trim();
        String newS = removeDuplicate(s);
        System.out.println("The string after removing the duplicates = "+ newS);
    }
}
