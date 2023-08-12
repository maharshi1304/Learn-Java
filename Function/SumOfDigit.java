package github.maharshi1304.Function;

public class SumOfDigit {
     static int sum(int n){
        int sum =0;
        while(n>0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n = n / 10;
        }
          return sum;
     }
       public static void main(String[] args) {
         System.out.println(sum(1234));
       }
    
}
