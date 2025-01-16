import java.util.Scanner;

public class BmiStatus {

    public static String getStatus(double bmi){
        if(bmi <= 18.4)
            return "Underweight";
        else if(bmi >= 18.5 && bmi < 25.0)
            return "Normal";
        else if(bmi >= 25.0 && bmi <40)
            return "Overweight";
        return "Obese";
    }
    public static String[][] getBmiAndBmiStatus(double[][] infos){
        String[][] ans = new String[infos.length][2];
        // 0-> Bmi
        // 1-> Bmi status
        for (int i = 0; i < infos.length; i++) {
            double weight = infos[i][0];
            double height = infos[i][1];
            height = height/100;
            double bmi = Math.round((weight / (height * height)) * 100.0) /100.0;
            ans[i][0] = String.valueOf(bmi);
            ans[i][1] = getStatus(bmi);



        }
        return ans;

    }
    public static String[][] getAllDetails(double[][] infos){
        String[][] bmiAndStatus = getBmiAndBmiStatus(infos);
        String[][] masterData = new String[infos.length][4];
        // 0-> height
        // 1-> weight
        // 2-> BMI
        // 3-> Status
        for (int i = 0; i < infos.length; i++) {
            double height = infos[i][1];
            double weight = infos[i][0];
            String bmi = bmiAndStatus[i][0];
            String status = bmiAndStatus[i][1];
            masterData[i][0] = String.valueOf(height);
            masterData[i][1] = String.valueOf(weight);
            masterData[i][2] = bmi;
            masterData[i][3] = status;
        }
        return masterData;
    }

    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        //Taking input of the weights and heights of 10 persons
        double[][] infos  = new double[10][2];
        // 0-> weight(in kg)
        // 1-> height(in cm)
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight and height of person "+(i+1) );
            double weight =sc.nextDouble();
            double height = sc.nextDouble();
            infos[i][0] = weight;
            infos[i][1] = height;
        }
        // get all the data(height,weight,bmi,status)
        String[][] dataset = getAllDetails(infos);
        System.out.println("Height -- Weight --- BMI --- Status");
        System.out.println();
        for (int i = 0; i <dataset.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-10s",dataset[i][j]);
            }
            System.out.println();

        }

    }
}

