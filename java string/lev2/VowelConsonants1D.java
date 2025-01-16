import java.util.Scanner;

public class VowelConsonants1D {
    public static int[] counter(String s){
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(Character.isUpperCase(ch))
                    ch = (char)(ch+32);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else consonants++;
            }

        }
        return new int[]{vowels,consonants};
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next().trim();
        int[] ans = counter(s);
        System.out.println("Number of vowels are "+ans[0]);
        System.out.println("Number of consonants are "+ans[1]);
    }

}