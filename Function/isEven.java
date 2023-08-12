package github.maharshi1304.Function;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class isEven {
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        } 
         else{
            return false;
         }
    }

     public static void main(String[] args) {
        //System.out.println(isEven(7));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur num: ");
        int n = sc.nextInt();
          
        if(isEven(n)){
            System.out.println("  num is Even");
        } else{
            System.out.println( "num is odd");
        }
        //System.out.println(isEven(n));
     }
    
}
     