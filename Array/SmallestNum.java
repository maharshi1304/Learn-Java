package github.maharshi1304.Array;

public class SmallestNum {
    static int getSmallest(int num[]){
    int smallest = Integer.MAX_VALUE;  // +INFINITY UNDER java.util.pacakage we used

    for(int i=0; i<num.length; i++){
        if(smallest>num[i]){
            smallest=num[i];
        }
    }
       return smallest;
}
         public static void main(String[] args) {
         int num[] = {9, 7, 2, 3, 1};
         int result = getSmallest(num);
         System.out.println("smallest num is:" + result);
    }
    
}   
