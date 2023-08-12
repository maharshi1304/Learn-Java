package github.maharshi1304.Function;
import java.util.*;
public class DeciToBinary {
    static void deciToBin(int n){
        int pow = 0;
        int binNum = 0;
        
        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            n = n / 2;
        }
          System.out.println( binNum);
    }

      public static void main(String[] args) {
       // deciToBin(67);
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter ur num :");
         int n = sc.nextInt();
         deciToBin(n);
      }
    
}
