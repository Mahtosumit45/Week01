import java.util.*;
import java.lang.Math;

public class BmiTeamV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input of the number of members in the team
        int num = sc.nextInt();

        // Creating 4 arrays to store the weight, height, BMI, and status of the person
        double[][] info = new double[num][3];
        String[] status = new String[num];

        // Taking input of weights and heights of persons
        System.out.println("Enter the weights (KG) and heights (CM) of the person: ");
        for (int i = 0; i < num; i++) {
            info[i][0] = sc.nextDouble();//weights
            info[i][1] = sc.nextDouble();//heights

            // Convert height to meters for BMI calculation
            double heightInMeters = info[i][1] / 100.0;

            // BMI calculation
            double bmi = info[i][0] / Math.pow(heightInMeters, 2);

            // Round the BMI to one decimal place
            bmi = Math.round(bmi * 10.0) / 10.0;

            info[i][2] = bmi;

            // Determine the status based on the BMI value
            String s;
            if (bmi <= 18.4) {
                s = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                s = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                s = "Overweight";
            } else {
                s = "Obese";
            }
            status[i] = s;
        }

        // Printing the output
        for (int i = 0; i < num; i++) {
            System.out.println("The person " + (i + 1) + " height is = " + info[i][1] +
                    " cm, weight is " + info[i][0] + " kg, BMI value is " + info[i][2] +
                    " and the status is " + status[i]);
        }
    }
}


