import java.util.*;
public class EmployeesSalary{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Create the array to input the 
        double[] salaries= new double[10];
        int[] exp = new int[10];
        System.out.println("Enter the employee salary with exp divided by space");
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    salaries[i] = sc.nextDouble();
                    if (salaries[i] <= 0) throw new IllegalArgumentException("Salary must be positive!");

                    exp[i] = sc.nextInt();
                    if (exp[i] < 0) throw new IllegalArgumentException("Years of service must be non-negative!");

                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input: " + e.getMessage() + " Please re-enter.");
                    sc.nextLine(); // Clear invalid input
                }
            }
        }
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double[] bonus = new double[10];
        double[] newsalaries = new double[10];
        for(int i =0;i<10;i++){
            if(exp[i]<5){
                bonus[i] = salaries[i] * 0.05;
                totalBonus += bonus[i];
            }
            else
                bonus[i] = salaries[i] * 0.02;
            newsalaries[i]  = salaries[i] + bonus[i]; 
            totalOldSalary += salaries[i];
            totalNewSalary += newsalaries[i];
        }

        System.out.println("Total bonus = "+totalBonus+"\n Total Old Salary = "+totalOldSalary+"\n Total New Salary = "+totalNewSalary);
    }
}


