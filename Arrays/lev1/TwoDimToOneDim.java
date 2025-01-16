import java.util.*;
public class TwoDimToOneDim{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Create two variable to store the row and colums
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arr2d = new int[row][column];
        for(int i =0 ;i<row;i++){
            for(int j = 0;j<column;j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        // converting the 2d array to 1d
        int[] masterArr = new int[row*column];
        int id = 0;

        for(int i =0;i<row;i++){
            for(int j = 0;j<column;j++){
                masterArr[id++] = arr2d[i][j];
            }
        }
        // Displaying the 1D array
        System.out.println("The Numbers are:");
        for(int it : masterArr)
            System.out.print(it+" ");
    }
}

    


