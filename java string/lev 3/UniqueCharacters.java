import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String s){
        int count = 0;

        int id = 0;

        while(true){
            try{
                char ch = s.charAt(id);
                count++;
                id++;
            }
            catch (Exception e){
                break;
            }
        }
        return count;
    }
    public static char[] getUniqueChar(String s){
        int size = getLength(s);
        char[] unique = new char[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            boolean flag = false;
            for (int j = 0; j < count; j++) {
                if(ch == unique[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                unique[count++] = ch;
            }
            
        }

        char[] ans = new char[count];
        for (int i = 0; i < count; i++) {
            ans[i] = unique[i];

        }
        return ans;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine().trim();
        char[] uniques = getUniqueChar(s);
        System.out.println("Unique characters are : ");
        for(char it:uniques)
            System.out.print(it+" ");
    }
}

