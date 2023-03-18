//import java.util.*;

public class test5 {
    public static void main (String a1[]){
       // float b = 23.4f;
       // int   a =  (int) b;
      //  System.out.println(a);

      /*char ch = 'a';
      char ch1 = 'b';
      char ch2 = 'c';
      int num  = ch;
      int num1 = ch1;
      int num2  = ch2;
      System.out.println(num);
      System.out.println(num1);
      System.out.println(num2); */
    // automatically promotes data type: byte, short, char
      char ch = 'a';
      char ch1 = 'b';
      System.out.println((int)ch);
      System.out.println((int)ch1);
      System.out.println(ch-ch1);

      //if one operand is long ,float,double then whole expression is promoted t0 long, float, double respectyively
       float a = 12.4f;
       int b = 45;
       long c = 67;
       double d = 399.9;
       double sol = (a*b+c-d);
       System.out.println(sol);
       

    }
}