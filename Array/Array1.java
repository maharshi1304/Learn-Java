package github.maharshi1304.Array;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {

        int marks[] = new int[100];
        Scanner sc  = new Scanner(System.in);

        // Array
         //int marks[] = new int[100];
          
       // Print PCM Scor--
         marks[0] = sc.nextInt(); // phy
         marks[1] = sc.nextInt(); // chem
         marks[2] = sc.nextInt(); // math

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);      
        System.out.println("math: " + marks[2]);

        // Update the marks of chem in array--
          marks[1] =  marks[1]  + 2;
          System.out.println("chem: " + marks[1]);

        // Percentage of PCM is--
          int Percentage = (marks[0]+marks[1]+marks[2]) / 3 ;
          System.out.println("percetage: " +Percentage+ "%");
          
    }
    
}
