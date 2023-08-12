package github.maharshi1304.Array;

import java.util.*;

public class CalendarProgram {
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        scanner.close();

        // Print the calendar for the month
        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the year and month of the calendar
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);

        // Set the day of the month to 1
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get the maximum number of days in the month
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Get the day of the week of the first day
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print the month and year
        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

        // Print the leading spaces
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("%-4d", day);

            // Move to the next line if it's a Saturday
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

            // Move to the next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        // Print a new line at the end if the last day is not a Saturday
        if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            System.out.println();
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}
