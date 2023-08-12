package github.maharshi1304.Function;

public class FnOverloading {

     // calculate sum of two digit
    static int sum(int a, int b){
        return a+b;

    }
      // calculate sum of three digit
    static int sum(int a, int  b, int c){
        return a+b+c;
    } 

     // calculate sum of two num
       static double sum(double c, double d){
          return c+d;
       }

     // calcualte sum of two num
       static long sum(long a, long b){
        return a+b;
       }

     // calculate sum of two float num
         static float sum(float a, float b){
            return a+b;
         }

     // calculating product of nums
       static int product( int a, int b, int c) {
        return a*b*c;
       }   
    public static void main(String[] args) {
        System.out.println(sum(5 , 4));
        System.out.println(sum(6 , 2));
        System.out.println(sum(2.5 , 2.5));
        System.out.println(sum(45678934 , 456789098));
        System.out.println(sum(5.5f , 5.5f));
        System.out.println((product( 2 , 5 , 6)));
    }
    
}
