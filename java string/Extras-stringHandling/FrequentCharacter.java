import java.util.Arrays;
import java.util.Scanner;

public class FrequentCharacter {
    public static char mostFrequentChar(String s){
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[(int) ch]++;


        }
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; // Update maxIndex if a larger value is found
            }
        }
        return (char)maxIndex;

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next().trim();
        char mostFrequent = mostFrequentChar(s);
        System.out.println("Most Frequent Character: "+mostFrequent);
    }
}
