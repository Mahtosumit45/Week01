import java.util.*;
import java.lang.Math;

public class GradeCalculatorV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input of the number of students
        System.out.println("enter the number of students");
        int num = sc.nextInt();
        // Created 3 arrays to store the marks , percentage and marks
        //
        int[][] marks = new int[num][3];
        double[] percentage = new double[num];
        char[] grade = new char[num];
        System.out.println("Enter the marks in physics chemisty maths seperated by space");


        for(int i =0 ;i<num;i++){
            int p,c,m;
            while(true){
                try{
                    p = sc.nextInt();
                    if(p<0 || p > 100) 
                        throw new IllegalArgumentException();
                    c = sc.nextInt();
                    if(c < 0 || c > 100)
                        throw new IllegalArgumentException();
                    m = sc.nextInt();
                    if(m < 0 || m > 100)
                        throw new IllegalArgumentException();
                    break;
                }
                catch (Exception e){
                    System.out.println("Reenter the marks in the range of 0 and 100");
                    sc.nextLine();
                }
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            int total = p+c+m;
            percentage[i] = (double)((p+c+m)/3);
            if(percentage[i] >= 80.0)
                grade[i] = 'A';
            else if(percentage[i] >= 70.0 && percentage[i] < 80.0 )
                grade[i] = 'B';
            else if(percentage[i] >= 60.0 && percentage[i] < 70.0)
                grade[i] = 'C';
            else if(percentage[i] >= 50.0 && percentage[i] < 60.0)
                grade[i] = 'D';
            else if(percentage[i] >= 40.0 && percentage[i] < 50.0)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        // Printing the output
        for(int i = 0;i<num;i++){

            System.out.println("Student "+(i+1)+" have marks in Physics = "+marks[i][0]+" Maths = "+marks[i][2]+ " Chemistry = "+marks[i][1]+" and have total percentage = "+percentage[i]+" and grade = "+grade[i]);
        }
    }
}



