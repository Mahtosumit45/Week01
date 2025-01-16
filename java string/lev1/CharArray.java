import java.util.Scanner;

public class CharArray {
    public static char[] generatecharArray(String s){
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);

        }
        return arr;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = generatecharArray(s);
        for(int i = 0;i<charArray1.length;i++)
        {
            if(charArray1[i] != charArray2[i]){
                System.out.println("NO both are not same");
                return;

            }
        }
        System.out.println("Yes both are same");
    }
}
