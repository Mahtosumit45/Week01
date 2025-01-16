import java.util.Scanner;

public class FrequencyOfChar2 {
    public static char[] getUniqueChar(String s) {
        int size = s.length();
        char[] unique = new char[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            boolean flag = false;
            for (int j = 0; j < count; j++) {
                if (ch == unique[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                unique[count++] = ch;
            }
        }

        char[] ans = new char[count];
        System.arraycopy(unique, 0, ans, 0, count); // Copy only the unique characters
        return ans;
    }

    public static String[][] characterFrequency(String s) {
        int[] frequency = new int[256];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)]++;
        }

        char[] uniqueChars = getUniqueChar(s);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Store frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = characterFrequency(input);

        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-------------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }
}
