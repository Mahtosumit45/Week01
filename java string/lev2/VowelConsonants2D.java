import java.util.Scanner;



public class VowelConsonants2D {
    public static String[][] counter(String s){
        int id = 0;
        String[][] ans = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(Character.isUpperCase(ch))
                    ch = (char)(ch+32);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    ans[id][0] = String.valueOf(ch);
                    ans[id++][1] = "Vowel";
                }
                else{
                    ans[id][0] = String.valueOf(ch);
                    ans[id++][1] = "Consonants";
                }
            }

        }
        return ans;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next().trim();
        String[][] ans = counter(s);
        System.out.println("Alphabet------Type");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%-10s",ans[i][j]);

            }
            System.out.println();

        }
    }

}

