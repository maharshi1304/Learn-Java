package github.maharshi1304.Function;
import java.util.*;
public class Function1 {
  
     // type 1 Function representation where return type is null & input is not taken by function
   static void printHelloWorld(){
      for(int i = 1; i<=2; i++){
        System.out.println("Hello World");
      }
   }

      // type 2 Function , where input defined as parametre inside parenthesis  functionName( int a, int b) & return type variable
         static int calculateSum(int a, int b){
            int sum = a + b;
            return sum;
            //System.out.println(""+sum);
         }
        public static void main(String[] args) {
        // function call
          printHelloWorld(); 

          Scanner sc = new Scanner(System.in);
          System.out.println(" enter the num1:");
          int a = sc.nextInt();
          System.out.println("enter the num2:");
          int b = sc.nextInt();
          int result =  calculateSum(a,b);// when return type is void -> calculateSum(a,b); use only
           System.out.println(" sum of two num: "+result);
    }
    
}
