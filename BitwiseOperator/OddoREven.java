
import java.util.*;
public class OddoREven {
    public static void oddoreven(int n){
        
        if((n & 1) == 0){
            System.out.println("no is Even");
        }else{
            System.out.println("no is Odd");
        }
        return; // Add a return statement
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
            int n = sc.nextInt();
            oddoreven(n);
        //oddoreven(6);
    }
    
}
