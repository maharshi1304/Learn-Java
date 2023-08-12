package github.maharshi1304.Array;

public class ArrayAasArguments {
    static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+2;
        }
    }
      public static void main(String[] args) {
        int marks[] = {96, 97, 98};
        update(marks);

        // print array store num--
         for(int i=0; i<marks.length; i++){
            System.out.print(" " +marks[i]);
         }
           System.out.println();

      }
    
}
