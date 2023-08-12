package github.maharshi1304.Function;
import java.io.PushbackInputStream;
import java.sql.RowId;
import java.util.*;
public class Palindrom {
    static boolean isPalindrom(int n){
        int palindrom = n;
        int reverse = 0;
        while(n>0){
         int lastDigit = palindrom % 10;
         reverse = reverse * 10 + lastDigit;
           palindrom = palindrom / 10;
        }

        if(n == reverse){
            return true;
        } 
          else{
             return false;
        }
    }
       public static void main(String[] args) {
          //System.out.println(isPalindrom(10001));

          Scanner sc = new Scanner (System.in);
          System.out.println(" Ente ur num: ");
          int palindrom = sc.nextInt();
          //System.out.println(isPalindrom(palindrom));
           
          if(isPalindrom(palindrom)){
            System.out.println(palindrom+ " num is palindrom");
          } else{
            System.out.println(palindrom+ "num is not palindrom");
          }
       }
}
