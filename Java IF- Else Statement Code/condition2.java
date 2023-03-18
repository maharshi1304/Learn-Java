import java.util.*;

public class condition2 {
    public static void main (String a1 []){
        
        // take input from user-
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt(); 

       // take input by default-
       // int  A = 12 , B = 16;

        if( A>= B){
            System.out.println( "A is larger than B");
        }
        
        else{
            System.out.println("B is larger than A");
        }
    }
    
}
