import java.util.Scanner;

public class compareStrings {
    public static int compare2Strings(String a, String b){
        int ans = a.compareTo(b);
        return ans;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings seperated by space");
        String a = sc.next().trim();
        String b = sc.next().trim();
        int value = compare2Strings(a,b);
        if(value<0){
            System.out.println(a+" comes before "+b+" in lexicographical order");
        }
        else if(value > 0){
            System.out.println(b+" comes before "+b+" in lexicographical order");
        }
        else{
            System.out.println("Both string are same");
        }
    }
}
