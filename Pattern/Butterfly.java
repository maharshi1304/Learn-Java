package github.maharshi1304.Pattern;

import javax.annotation.processing.ProcessingEnvironment;

public class Butterfly {
    static void butter_fly(int n){
        // 1st half outer loop--
        for(int i=1; i<=n; i++){

        // Print Stsrs inner loop--
        for(int j=1; j<=i; j++){
            System.out.print(" *");
        }
        
        // Print Spaces--
        for(int j=1; j<=2*(n-i); j++){
            System.out.print("  ");
        }

        // Print Stars--
        for(int j=1; j<=i; j++){
            System.out.print(" *");
        }
          System.out.println();
        }

        // 2nd halh   Mirror image or inverted image logic
          for(int i =n; i>=1; i--){
            // Print Stsrs inner loop--
        for(int j=1; j<=i; j++){
            System.out.print(" *");
        }
        
        // Print Spaces--
        for(int j=1; j<=2*(n-i); j++){
            System.out.print("  ");
        }

        // Print Stars--
        for(int j=1; j<=i; j++){
            System.out.print(" *");
        }
          System.out.println();
          }
    }

     public static void main(String[] args) {
        butter_fly(4);
     }
    
}
