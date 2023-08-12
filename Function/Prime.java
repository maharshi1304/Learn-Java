package github.maharshi1304.Function;

public class Prime {

    /*  ckeck num is prime or not
      static boolean isPrime(int n){
        boolean isPrime = true;
          for(int i = 2; i<n-1; i++){
            if(n % i == 0){
                isPrime = false;
                 break;
            }
          }
            return isPrime;
      }*/
         public static void main(String[] args) {
            System.out.println(isPrime(2));

            primesInRange(5);
         }
    

  // Another Method to check Prime or not -- Corner case
      public static boolean isPrime(int n) {
        if(n < 2){
         return false;
      } else{
         for(int i =2; i<n-1; i++){       //  logic will:- i<=n or i<=n-1; i<=n/2 ; i<=Math.sqrt(n);
            if(n % i == 0){ // complitely divided
                return false;
            }
               
         }
      }
             return true;
    }      
    
         
      
    public static void primesInRange(int n){
     for(int i = 2; i<=n; i++){
         if(isPrime(i)){
            System.out.print(i+" ");
         }
     }
       System.out.println();
   }
}
