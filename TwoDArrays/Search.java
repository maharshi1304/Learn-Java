package github.maharshi1304.TwoDArrays;

public class Search {
    public static boolean stairecaseSearch(int matrix[][], int key){
        int n = matrix.length;
        int i=0, j= n-1;
        
        while(i<n && j>=0){
            if(matrix[i][j]==key){
           System.out.println("key at("+i+", "+j+")");
           return true;
        }
         else if(key < matrix[i][j]){
            j--; // left
         }
           else{
            i++; // bottom
           }
    }
       System.out.println(" key no found");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][]= {{10,12,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
         int key =33;
    stairecaseSearch(matrix , key);
    }    
}
