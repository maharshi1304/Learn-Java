import java.util.*;
public class LeapYear {
    public static void main (String a1[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter year :");
       int year = sc.nextInt();

       if((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))){
        System.out.println(" yera is leap year.. ");
       }
         else {
            System.out.println("  year is not leap year..  ");
         }
    }
    
}
