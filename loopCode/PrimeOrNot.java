import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a num:");
         int  n = sc.nextInt();
         boolean isPrime = true;

         if(n==2){ // if(n<2){ isPrime = false;} bcz 0 & 1 are not prime number
            System.out.println("n is prime");
         }
           else{

            for(int i = 2; i< n; i++){ // i<= Math.sqrt() for large number or i<= n/2- loop run b/w n to n/2
                if(n % i == 0){
                isPrime = false;
                  break;
            }
           }
             /*String result = isPrime ? " prime" : " not prime";
              System.out.println(""+ result);*/
              if(isPrime ==true){
                System.out.println("n is prime");
                } 
                  else{
                     System.out.println("n is not prime");
                  }
    }
    
}
}