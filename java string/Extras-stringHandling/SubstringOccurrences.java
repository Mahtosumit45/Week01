import java.util.Scanner;

public class SubstringOccurrences {
    public static int countOfSubstringOccurrence(String s, String substr){
        int count = 0;
        int index = 0;
        while(index != -1){

            index = s.indexOf(substr,index);
            if(index != -1) {
                count++;
                index += substr.length();
            }


        }
        return count;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.next().trim();
        System.out.println("Enter a substring to check the occurrence ");
        String substr = sc.next().trim();
        int answer = countOfSubstringOccurrence(s,substr);
        System.out.println("The count of occurrence of "+substr+" in "+s+" = "+answer);
    }

}
