// Print keep entering Number till user enter a number Multiple of '10'
import java.util.*;
public class Multiple10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter ur no...");
            int n = sc.nextInt();
            
             if( n % 10 == 0 ) {
                    break;
             }
              System.out.println("number was :" +n);
        } while(true);
          

            }
           
    }
    

