import java.util.*;
import java.lang.Math;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input of the number of students
        System.out.println("Enter the number of students");
        int num = sc.nextInt();

        // Created 3 arrays to store the marks , percentage and marks
        //
        int[] marks = new int[num];
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
            marks[i] = p+c+m;
            percentage[i] = (double)(marks[i]/3);
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

            System.out.println("Student "+(i+1)+" have marks = "+marks[i]+" , percentage = "+percentage[i]+" and grade = "+grade[i]);
        }
    }
}


