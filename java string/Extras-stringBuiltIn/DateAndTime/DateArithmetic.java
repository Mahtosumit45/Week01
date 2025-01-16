import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in format(dd-MM-yyyy) :");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate,formatter);
        //adding 7 days then 1 month then 2 years then 3 weeks to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).plusWeeks(3);
        System.out.println("Date after all the operations = "+newDate.format(formatter));


    }
}
