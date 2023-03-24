import java.util.*;

public class OnetoN {
    public static void main(String a1[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter range : ");
        int range = sc.nextInt();
        
        int counter = 1;

        while( counter <= range){
            System.out.print(" "+ counter);
            counter ++;
        }
    }
}
