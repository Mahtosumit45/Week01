import java.util.Scanner;

public class CharacterRemover {
    public static String removeCharacter(String s,String b){
        return s.replace(b,"");

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        String s = sc.next().trim();
        System.out.println("Enter a character to remove from string");
        String ch = String.valueOf(sc.next().charAt(0));
        String answer = removeCharacter(s,ch);
        System.out.println("Modified String: "+answer);

    }
}
