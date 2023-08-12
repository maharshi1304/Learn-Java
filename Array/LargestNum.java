package github.maharshi1304.Array;

public class LargestNum {
   static int getLargest(int num[]){
    int largest = Integer.MIN_VALUE; // -INFINTY UNDER import java.util.*; pacakage hm use krte hai
    
    for(int i=0; i<num.length; i++){
        if(largest < num[i]){
            largest=num[i];
        }
    }
       return largest;
   }
   
        public static void main(String[] args) {
        int num[] = {1, 2, 3, 6, 5};
        int result = getLargest(num);
        System.out.println("get largest num:" +result);
    }
    
}
