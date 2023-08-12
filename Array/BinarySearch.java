
package github.maharshi1304.Array;
public class BinarySearch {
    static int binary_search(int num[], int key){
        int start=0, end= num.length-1;

        // loop
                while(start<=end){
                  int mid = (start + end) / 2;
                
                  if(num[mid] == key){
                    return mid;
                  }
                   if(num[mid]<key){
                    start = mid+1;
                   }
                     else{
                      end = mid-1;
                     }
                }
                     
                      return -1;
                }
    
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 10;
        int result = binary_search(num, key);
        System.out.println(" "+ result);

    }
    
}
