import java.util.Scanner;

public class BMIv2 {
    public static void populateBMI(double[][] arr){
        for (int i = 0; i < 10; i++) {
            arr[i][2] = arr[i][0]/((arr[i][1]/100) * (arr[i][1]/100));


        }
    }
    public static String bmiStatus(double bmi){
        if(bmi <= 18.4)
            return  "Underweight";
        else if(bmi >= 18.5 && bmi < 25.0)
            return "Normal";
        else if(bmi >= 25.0 && bmi < 40)
            return "Overweight";

        return "Obese";
    }

    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);

        // 2D array for storing weight at 0 and height at 1
        double[][] arr = new double[10][3];
        // Storing the values in arraya
        System.out.println("Enter the weights and height of 10 persons");
        for(int i = 0;i<10;i++){
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();


        }
        populateBMI(arr);
        for (int i = 0; i < 10; i++) {
            double weight = arr[i][0];
            double height = arr[i][1];
            double bmi = arr[i][2];

            System.out.println("Person "+(i+1)+" has \nweight = "+weight+"\nheight = "+height+"\nbmi = "+String.format("%.2f",bmi)+"bmi status = "+ bmiStatus(bmi));
        }

    }
}
