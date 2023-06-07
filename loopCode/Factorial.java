
  //Write a program to find the factorialof any number entered by the user
import java.util.*;
public class Factorial {
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the  number:");
    int num = sc.nextInt();
    int fact = 1;

    // logic Part
     for(int i = 1; i<= num; i++){
        fact *= i;
        System.out.println("factorisl is: " + fact);  // show step wise factorial operation
     }
    // System.out.println("factorisl is: " + fact);   // show optimize solution in (one line only)
 }
    
}
