import java.util.*;
public class TempConverterCelcius{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);


        // Created a variable to take input of temperature in celcius
        int celcius = sc.nextInt();

        // Converting the celcius to farenheit
        double farenheitResult = (celcius * 1.8) + 32;

        // Displaying the output
        System.out.println("The " +celcius+" celcius is "+String.format("%.2f",farenheitResult)+ " fahrenheit");
    }
}

