package github.maharshi1304.TwoDArrays;

public class Sum {
    public static void main(String[] args) {
        int matrix [][] = {{1,4,9}, {11,4,3},{2,2,3}};
        int sum =0;

        // sum of 2nd row elements
         for(int j =0; j<matrix[0].length-1; j++){
            sum+= matrix[1][j];
         }
           System.out.println("sum is :" +sum);
    }
}
