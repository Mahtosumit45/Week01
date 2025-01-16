import java.util.Scanner;

public class AmarAkbarAnthony {
    public static int getMaxHeights(int[] heights){
        int tallest = heights[0];
        for(int it: heights)
            tallest = Math.max(it,tallest);
        return tallest;
    }
    public static int getMinAge(int[] ages){
        int youngest = ages[0];
        for(int it: ages)
            youngest = Math.min(it, youngest);
        return youngest;
    }

    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[3];
        int[] ages = new int[3];
        /*
        0 -> Amar
        1 -> Akbar
        2 -> Anthony
         */
        System.out.println("Enter the age and heights seperated by space");
        for(int i =0;i<3;i++){

            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        int youngest = getMinAge(ages);
        int tallest = getMaxHeights(heights);

        System.out.println("youngest is "+youngest+" year old");
        System.out.println("tallest height is "+tallest+" cm");

    }
}
