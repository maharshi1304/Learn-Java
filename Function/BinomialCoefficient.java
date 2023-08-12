package github.maharshi1304.Function;

public class BinomialCoefficient {
    
        static int fact(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

        public static void main(String[] args) {
        System.out.println((fact(10, 2)));
    }
    
}
