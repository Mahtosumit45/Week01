import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    public static String[] characterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (char c : chars) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[] result = characterFrequency(input);

        System.out.println("Character - Frequency");
        System.out.println("----------------------");
        for (String entry : result) {
            System.out.println(entry);
        }
    }
}


