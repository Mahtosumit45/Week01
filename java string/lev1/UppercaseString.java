import java.util.Scanner;

public class UppercaseString {
    public static String toUpper(String s){
        String temp = "";
        for(int i = 0;i<s.length();i++){
            char it = s.charAt(i);
            if(Character.isLowerCase(it))
                temp+=String.valueOf((char)(it-32));
            else{
                temp += String.valueOf(it);
            }

        }
        return temp;

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String upperString1 = toUpper(s);
        String upperString2 = s.toUpperCase();
        if(upperString1.equals(upperString2))
            System.out.println("Both are equal ");
        else
            System.out.println("Both are Different");
        System.out.println("The Strings are "+upperString1+" and "+upperString2);

    }
}
