import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        return age>=18;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        //Create an array and store the ages of 10 persons
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();

        }
        StudentVoteChecker svc = new StudentVoteChecker();
        for (int i = 0; i < ages.length; i++) {
            if(svc.canStudentVote(ages[i]))
                System.out.println("Yes Person no. "+(i+1)+" Can vote");
            else
                System.out.println("No Person no. "+(i+1)+" Cannot vote");

        }

    }

}
