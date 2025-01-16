import java.util.Scanner;

public class FrequencyOfChars {
    public static int[][] getfreqArray(String s){
        int[][] arr = new int[256][2];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[(int)ch][0] = (int)ch;
            arr[(int)ch][1]++;

        }
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i][1] != 0 )
                count++;

        }
        int[][] result = new int[count][2];
        int id = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][1] != 0){
                result[id][0] = arr[i][0];
                result[id++][1] = arr[i][1];
            }
        }
        return result;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next().trim();
        int[][] frequencyArray = getfreqArray(s);
        for (int i = 0; i < frequencyArray.length; i++) {
            char ch = (char)frequencyArray[i][0];
            int freq = frequencyArray[i][1];
            System.out.print(ch+" "+freq);
            System.out.println();
        }
    }
}
