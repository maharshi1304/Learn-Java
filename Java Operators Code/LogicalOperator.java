  public class LogicalOperator{
  
  public static void main(String a1[]){
    // logical  && operator-
   // System.out.println((3>2) && (5>0));
    //System.out.println((3>2) && (5<0));

    // logical OR operatpr-
    //System.out.println((3<2) || (5<0));
    //System.out.println((3>2) && (5>0));

    // logical ! operator-
    System.out.println(! (5>0));

    // Assignment operator-
       /*int a = 12;
         a+= 10;
         System.out.println(a) ;
       int b =12;
         b-= 4;
         System.out.println(b) ;
         int c= 12;
             c*= 4;
         System.out.println(c) ; 

         int d = 12;
            d/= 5;
            System.out.println(d) ;

         int e = 12;
           e%= 8;
           System.out.println(e) ;   */

           //q1. practice-
           /*int x = 2, y = 5;

           int exp1 = (x*y /x);
           int exp2 = (x* (y/x));

           System.out.println(exp1 + " ,");
           System.out.println(exp2 );*/
           
           // q3. 
             /*int x, y, z;
             x = y = z = 2;
             x+= y;
             y-= z;
             
             z /= (x+y);
             System.out.println(x + " " + y + "" +z);*/

            // q4. 
             /*int x =9, y = 12; 
             int a = 2, b = 4, c = 6;
             int exp = 4/3 * (x + 34) + 9 * (a + b *c)+(3+y*(2+a)) / (a + b * y);

             System.out.println((exp)); */

             // q5. 
               int x = 10, y = 5;
               
               int exp1 = (y * (x / y + x / y));

               int exp2 = (y * x / y + y * x / y);

               System.out.println(exp1);
               System.out.println(exp2);



    }
    
}
