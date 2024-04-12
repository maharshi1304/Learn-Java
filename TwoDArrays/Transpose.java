package github.maharshi1304.TwoDArrays;

public class Transpose {
    public static void printmatrix(int matrix[][]){
        System.out.println("matrix is:");

        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix [][] = {{11, 12, 13},{21, 22, 23}};
        int row=2, col=3;
        
        int transpose[][] = new int[col][row]; 
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                transpose[j][i]= matrix[i][j];
            }
        }
           printmatrix(matrix);
           printmatrix(transpose);
           
    }
    
}
