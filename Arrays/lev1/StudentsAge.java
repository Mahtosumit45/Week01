import java.util.*;
public class StudentsAge{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Creating an Array of size 10 to store age of 10 students
        int[] arr = new int[10];
        System.out.println("Enter the ages of students: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= 18)
                System.out.println("The student with the age "+arr[i]+" can vote.");
            else
                System.out.println("The student with the age "+arr[i]+" cannot vote.");
        }
    }
}

