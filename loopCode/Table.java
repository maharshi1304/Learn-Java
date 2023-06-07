
// Write a program to print the multiplication table of anumber N,entered by the user-
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        // logic part
         for(int i = 1; i<= 10; i++){
            System.out.println(n+ " * " +i+ " = " +(n*i));;
            //System.out.println(n*i);
        }
           
    }
    
}
