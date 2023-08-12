package github.maharshi1304.Function;

public class Factorial {

    static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
           f*=i;
        }
          return f; // factorial ofv n
    }
       
      // Binomial Coefficent
        
    
        static int binCoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
      public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println((binCoeff(10, 2)));
      }
}
