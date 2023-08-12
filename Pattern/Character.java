package github.maharshi1304.Pattern;
// Character Pattern
/*
 A
 B C
 D E F
 G H I J*/
public class Character {
    public static void main(String[] args) {
        int n = 8;
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++ ){
                   System.out.print(ch);
                   ch++; // update the characters
            }
              System.out.println();
        }
    }
}
