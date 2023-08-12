package github.maharshi1304.Array;

import javax.swing.border.EmptyBorder;

public class LinearSearch {
   static int linear_search(int numbers[], int n){
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]==n){
            return i;
        }
    }
       return -1;
    }

   /*  static String menue_chart(String menue, String key){
        for(String i="zero"; i<menue.length; i++){
            if(menue[i]==key){
                return i;
            }
        }
         return nonEmptyString;
    }*/

        public static void main(String[] args) {
        int numbers[] = {2,4,6,12,10,8,12,16};// num will repeated then ist occurence of num at index will printed as output  
        int n = 12;

        //String menue[] = {"burger", " roll", "samose", "coke", "pistanuts"};
        //String key = "roll";

        int index = linear_search(numbers, n);

        if(index==-1){
            System.out.println("index  not found" +index);
        } else{
         System.out.println(" "+index);
    }
    }
}