package github.maharshi1304.Sorting;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class SelectionSort {

      public static void selection_sort(int arr[]){
        for(int i =0 ; i<arr.length-1; i++){
             int minpos = i;

            for(int j =i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
                //Swap--
                    int temp = arr[minpos];
                 arr[minpos] = arr[i];
                      arr[i] = temp;

                }
        }
           static void print_arr(int arr[]){
             for(int i =0; i<arr.length ; i++){
                System.out.print(" "+ arr[i]);
             }
           }
      
    public static void main(String[] args) {
           int arr[] = {5,4,1,3,2};
           selection_sort(arr);
           print_arr(arr);
    }
}
    

