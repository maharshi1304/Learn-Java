package github.maharshi1304.Pattern;

public class Solid_Rhombus {
    static void solid_rhombus(int n){
        // Print outer loop--
        for(int i =1; i<=n; i++){
        
        // Print Spaces inner loop--
        for(int j=1; j<=(n-i); j++){
            System.out.print("  ");
        }
        
        // Print stars--
        for(int j=1; j<=n; j++){
            System.out.print(" *");
        }
          System.out.println();
        }
    }

       // Hollow Rhombus--
         static void hollow_rhombus(int n){
            // outer loop--
            for(int i =1; i<=n;i++){

            // Spaces Print--
             for(int j =1; j<=(n-i); j++){
                System.out.print("  ");
             }
             
             // Stars with hollow rectangle concept (use) print--
              for(int j=1; j<=n ; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(" *");
                } else{
                    System.out.print("  ");
                }
              }
                 System.out.println();
            }
         }

      public static void main(String[] args) {
        //solid_rhombus(5);
        hollow_rhombus(12);
      }
    
}
