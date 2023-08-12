package github.maharshi1304.Function;

public class BinaryToDecimal {

    static void binToDeci(int binNum){

        int pow = 0;
        int deci = 0; // decimal

        while(binNum > 0){
            int lastDigit = binNum % 10;
            deci = deci + (lastDigit *(int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
          System.err.println(" "+ deci);
    }
       public static void main(String[] args) {
          binToDeci(10100011);
       }
    
}
