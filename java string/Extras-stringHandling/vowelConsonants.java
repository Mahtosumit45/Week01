import java.util.Scanner;

public class vowelConsonants {
    public static int[] countVowelConsonants(String s){
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else consonants++;

        }
        return new int[]{vowels,consonants};
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] counts = countVowelConsonants(s);
        System.out.println("Number of vowels in "+s+" = "+counts[0]);
        System.out.println("Number of consonants in "+s+" = "+counts[1]);
    }
}
