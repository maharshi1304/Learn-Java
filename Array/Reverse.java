package github.maharshi1304.Array;
public class Reverse {

    public static void reverse(int num []){
        int first =0, last =num.length-1;
        
        while(first<last){

            //swap
            int temp = num[first];
            num[first] = num[last];
            num[last] =  temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num [] = {2,4,6,8,10};

        reverse(num);

        //print reverse Array
        for(int i = 0; i<num.length; i++){
            System.out.print(" " + num[i]);
        }
          System.out.println();


    }
    
}
