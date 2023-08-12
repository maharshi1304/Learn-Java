package github.maharshi1304.Pattern;

public class HollowRectangle {

     static void hollow_Rectangle(int totlRows, int totlColms){
        // outer loop-- for rows
          for(int i = 1; i<=totlRows; i++){

               // inner loop-- for colms
               for(int j =1; j<=totlColms; j++){
                 // cell (i, j)
                  if(i== 1 || i == totlRows || j ==1 || j== totlColms){
                    
                    // Print cell *
                      System.out.print(" * ");
                  }   else {
                     System.out.print( "   ");
                  }
               }
                  // next line
                   System.out.println();  
                 
          }
     }

           // Print Roteted-half Pyramid--
             static void halfroteted_pyramid(int n){
               // outer loop--
                 for(int i = 1 ; i<=n; i++){
                    //inner loop--
                      for (int j = 1 ; j<=n-i; j++){
                         System.out.print(" ");
                    }
                      for (int j =1; j<=i; j++){
                         System.out.print("*");
                      }
                       System.out.println();
                 }
             }

                // Inverted Half-Pyramid--
                   static void inverted_half_pyramid(int n){
                    // outer loop--
                      for(int i =1; i<=n; i++){

                         // inner loop-- logic
                           for (int j =1; j<=n-i+1; j++){
                              System.out.print(j+" ");
                           }
                            System.out.println();
                      }
                   }

                // Floyd's Traingle--
                      static void flyods_traingle(int n){
                         int counter = 1;;
                 // outer loop--
                       for(int i =1; i<=n ;i++){

                  // inner loop--
                          for(int j =1; j<=i; j++){
                          System.out.print(counter+" ");
                          counter++;
                     }
                       System.out.println();
              }
              }
                
              // 0-1 Traingle Pattern
                static void zero_1_traingle(int n){
                    // outer loop--
                     for(int i =1; i<=n; i++){
                         // inner loop logic [i + j == even or odd for each cell check then print]
                         for(int j =1; j<=i; j++){
                              if((i + j) % 2 == 0){
                                   System.out.print(" 1 ");
                              }  else{
                                   System.out.print("{0}");
                              }
                         }
                           System.out.println();
                     }

                }


               public static void main(String[] args) {

                    // function call--
                    // hollow_Rectangle(10 , 5);
                    // halfroteted_pyramid(4);
                    // inverted_half_pyramid(5);
                    // flyods_traingle(5);
                    zero_1_traingle(5);
     }
    
}
