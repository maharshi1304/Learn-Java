//Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int evensum = 0, oddsum = 0;
    int choice;

     // Using While loop-
       do{
        System.out.println("enter the number..");
         int num = sc.nextInt();

         if( num % 2 == 0){
            evensum+= num;
         }
           else {
            oddsum+= num;
           }
             System.out.print("Do you want to Continue? Press 1 for  yes or 0 for no");
         choice = sc.nextInt();
          /*System.out.println("evensumm is:" +evensum);
      System.out.println("oddsum is:" +oddsum);*/
           
       }
         while(choice == 1);
         System.out.println("evensim is:" +evensum);
      System.out.println("oddsum is:" +oddsum);
    }     
      /*System.out.println("evensim is:" +evensum);
      System.out.println("oddsum is:" +oddsum);*/
    

}