package github.maharshi1304.Sorting;

public class BubbleSort {
    public static void   bubble_sort(int arr[]){ //  bubble_sort(int arr[] , int n)
      int n = arr.length;
      for(int i =0; i<n-1; i++){
        for(int j = 0; j<n-1-i; j++){
            //if(arr[j]<arr[j+1]) // Decreasing order
              if(arr[j]>arr[j+1]){ // Increasing order

             // Swaping--
              int temp = arr[j];
               arr[j]  = arr[j+1];
               arr[j+1]= temp;
             }
        }
      }
    }
    
     // print array--
        public static void print_arr(int arr[]){
           for(int i =0; i<arr.length; i++){ 
            System.out.print(" " +arr[i]);
        }
           System.out.println();

      }


    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        
        bubble_sort(arr); // Function call

        print_arr(arr);   // Sorted array call
    }
    
}
