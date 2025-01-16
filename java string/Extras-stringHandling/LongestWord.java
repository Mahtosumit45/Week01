import java.util.Scanner;

public class LongestWord {
    public static String getLongestWord(String s){
        String [] words = s.split(" ");
        int longest = 0;
        for (int i = 0; i < words.length; i++) {
            longest = Math.max(words[i].length(),longest);

        }
        for(String it :words){
            if(it.length() == longest){
                return it;

            }
        }
        return null;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        String  ans = getLongestWord(s);
        System.out.println("The longest word is "+ans);
    }
}
