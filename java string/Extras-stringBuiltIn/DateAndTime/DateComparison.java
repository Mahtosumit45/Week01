import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in format (dd-MM-yyyy");
        String tempDate1 = sc.nextLine();
        System.out.println("Enter another date in format (dd-MM-yyyy");
        String tempDate2 = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        LocalDate date1 = LocalDate.parse(tempDate1,formatter);
        LocalDate date2 = LocalDate.parse(tempDate2,formatter);

        if(date1.isBefore(date2)){
            System.out.println("Date 1 Is BEFORE Date 2");

        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is AFTER Date 2");
        }
        else
            System.out.println("Date 2 is Equal to 2");
    }
}
