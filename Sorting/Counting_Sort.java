package github.maharshi1304.Sorting;

public class Counting_Sort {
    public static void counting_sort(int arr[]){
          int largest = Integer.MIN_VALUE;
          for(int i =0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
          }

          // for frequency of numbers counting--in arr[]
          int count[] = new int [largest+1];
          for(int i=0; i<arr.length; i++){
             count[arr[i]]++;
    } 
         // Arenging arr in original array[]--
           int j =0;
           for(int i =0; i<count.length;i++){
              while(0<arr[i]){
                arr[j] = i;
                  j++;
                  count[i]--;
              }
           }
        }
           static void print_arr(int arr[]){
            for(int i=0;i<arr.length; i++){
                System.out.println(arr[i] + " ");
            }
           }
        
    public static void main(String[] args) {
       int arr[] = {1,4,1,3,2,4,3,7};
          counting_sort(arr); 
          print_arr(arr);
    }}
  