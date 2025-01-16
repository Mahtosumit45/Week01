import java.util.*;
public class TempConverterFahrenheit{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);


        // Created a variable to take input of temperature in celcius
        int fahrenheit = sc.nextInt();

        // Converting the celcius to farenheit
        double celciusResult = (fahrenheit - 32 )   * 0.55;

        // Displaying the output
        System.out.println("The " +fahrenheit+" fahrenheit is "+String.format("%.2f",celciusResult)+ " celcius");
    }
}


