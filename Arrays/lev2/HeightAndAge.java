import java.util.*;
public class HeightAndAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // creating 2 arrays to store the height an age of amar akbar and anthony
        int[] ages = new int[3];
        int[] heights = new int[3];

        System.out.println("Enter the age and height of the person");
        for(int i =0;i<3;i++){
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        /*
         0 -> amar
         1 -> akbar
         2 -> anthony
         */
        if(ages[0] < ages[1] && ages[0] < ages[2])
            System.out.println("Amar is youngest");
        else if(ages[1] < ages[0] && ages[1] < ages[2])
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        if(heights[0] > heights[1] && heights[0] > heights[2])
            System.out.println("Amar is tallest");
        else if(heights[1] > heights[0] && heights[1] > heights[2])
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");

    }
}

            


