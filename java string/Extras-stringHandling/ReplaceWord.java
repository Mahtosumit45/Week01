import java.util.Scanner;

public class ReplaceWord {

    public static String removeCharacter(String s,String b,String word){
        return s.replace(b,word);

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        String s = sc.nextLine();
        System.out.println("Enter a character to remove from string");
        String ch = sc.next().trim();
        System.out.println("Enter a word to replace the old word");
        String word = sc.next().trim();
        String answer = removeCharacter(s,ch,word);
        System.out.println("Modified String: "+answer);

    }
}


