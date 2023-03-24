import java.util.*;

public class SumOfnNaturalNumber {
    public static void main(String a1[]){
      Scanner sc = new Scanner (System.in);
      System.out.print("enter num :");
      int n = sc.nextInt();
      
      int sum = 0;
      int i = 1;
      while( i <= n){
        sum += i;
        i++;
      }
          System.out.print(sum);
    }
}
