import java.util.*;

public class Calculator{
    public static void main (String a1[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        

        System.out.println("Enter number b"); 
        int b = sc.nextInt();
        
        
        System.out.println("Enter Operator...");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' : System.out.println(a+b);
                       break;
            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;
            case '/' : System.out.println(a/b);
                       break;
            case '%' : System.out.println(a%b);
                       break;
            default  : System.out.println("advanced calculator");

        }
            
    }
}