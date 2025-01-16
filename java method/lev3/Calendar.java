import java.util.Scanner;

public class Calendar {
    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0)
                return year % 400 == 0;
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static String getMonthName(int month) {
        return months[month - 1];
    }

    public static int getFirstDay(int month, int year) {
        if (month < 3) { // January or February
            month += 12; // Treat as months 13 and 14 of the previous year
            year -= 1;
        }
        int y0 = year;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month - 2;
        return (1 + x + (31 * m0) / 12) % 7; // Day of the week (0 = Sunday)
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(year, month);
        int firstDay = getFirstDay(month, year);

        // Print the header
        System.out.printf("       %s %d%n", monthName, year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Final newline for formatting
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the month (1-12):");
            int month = sc.nextInt();
            while (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a value between 1 and 12:");
                month = sc.nextInt();
            }

            System.out.println("Enter the year (positive integer):");
            int year = sc.nextInt();
            while (year <= 0) {
                System.out.println("Invalid year. Please enter a positive value:");
                year = sc.nextInt();
            }

            displayCalendar(month, year);
        } finally {
            sc.close(); // Close the scanner to release resources
        }
    }
}
