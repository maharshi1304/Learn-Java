// Q.1 average of 3 num:
import java.util.*;


public class Average {
    public static void main (String a1[]){

        Scanner sc = new Scanner(System.in);
        /*int A = sc.nextInt();
        int B = sc.nextInt();
        float  C = sc.nextInt();
        float average = (A+B+C)/3;
        System.out.println("average is: " +average);*/

        //Q.2 area of square:
         
       /*  float a = sc.nextInt();
        float area = a*a;
        System.out.println("area is:" + area);*/
        
        // Q3 find total cost of pen ,pencil, ereaser & gst 18% also-
         int pen = sc.nextInt();
         int pencil = sc.nextInt();
         int ereaser = sc.nextInt();
         //int gst    = sc.nextInt();
         int totalcost = (pen + pencil + ereaser );
         System.out.println("totalcost is:" +totalcost);
         
        
        //  Add - 18%gst bill:
        float newtotal = totalcost +(0.18f * totalcost);
        System.out.println("newtotal is:" +newtotal);

                



    }
    
}
