package github.maharshi1304.Pattern;
// Print Half-Pyramid Pattern
/*1  
  12
  123
  1234*/ 

public class HalfPyramid {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            for(int num = 1; num<=i; num++ ){
                System.out.print(num);
            }
              System.out.println();
        }
    }
}
