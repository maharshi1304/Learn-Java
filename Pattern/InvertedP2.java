package github.maharshi1304.Pattern;
//package github.maharshi1304.Patteern_1 Code;

 // inverted patter
public class InvertedP2 {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i+1); j++){
                System.out.print('*');
            }
            
            System.out.println();
            
        }
    }
}
