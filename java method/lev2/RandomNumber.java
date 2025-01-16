import java.util.Arrays;
import java.util.Scanner;

public class RandomNumber {
    public int[] generate4DigitRandomArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = (int) (Math.random() * 9000) + 1000;
            arr[i] = randomNumber;
            
        }
        return arr;
    }
    public double[] findAverageMinMax(int[] numbers){
        Arrays.sort(numbers);
        double mini  = numbers[0];
        double maxi = numbers[numbers.length-1];
        double sum = 0.0;
        for(int it: numbers)
            sum+=it;
        double avg = (double)sum/numbers.length;
        return new double[]{mini,maxi,avg};

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Created a variable to store the size of array as user input
        int size = sc.nextInt();
        //Calling the function to get the random number
        RandomNumber rn = new RandomNumber();
        int[] numbers = rn.generate4DigitRandomArray(size);
        double[] minMaxAvg = rn.findAverageMinMax(numbers);
        //printing the number generated
        System.out.print("The numbers are ");
        for(int it: numbers) System.out.print(it+" ");
        System.out.println("\nThe minimum number is "+numbers[0]);
        System.out.println("The maximum number is "+numbers[1]);
        System.out.println("Average of the numbers are "+numbers[2]);




    }
}
