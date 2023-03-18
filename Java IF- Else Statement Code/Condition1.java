import java.util.*;

public class Condition1 {
    public static void main(String []a1){

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt(); 
        
        if(age >= 18){
            System.out.println("adult :  can voting , driving , ");
        }

         
        // use here logical operators :-
       /*  if(age >= 13 && age <= 18){

        System.out.println("teenager: can reading only " );
        } */

        else{
            System.out.println("not adult : athey cn not do voting , driving");
        }
    }
    
}
