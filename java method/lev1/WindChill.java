import java.util.Scanner;

public class WindChill{
    public double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + (0.6215 * temperature) + (0.4275* temperature - 35.75) * windSpeed;
        return windChill;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Taking the input of the temperature and the Windspeed
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();

        // Calculating the Wind Chill using the function
        WindChill wc = new WindChill();
        double windChill = wc.calculateWindChill(temperature,windSpeed);

        //Displaying the output
        System.out.println("The wind Chill value is "+windChill);
    }
}
