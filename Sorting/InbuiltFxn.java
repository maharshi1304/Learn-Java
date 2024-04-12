package github.maharshi1304.Sorting;
import java.util.Arrays;
//import java.util.Collections;

//import javax.swing.plaf.synth.SynthTabbedPaneUI;
public class InbuiltFxn {
    public static void main(String[] args) {
        Integer [] arr = {5, 4, 1, 3, 2}; // int[] as Collections.reverseOrder doesn't work for primitive types.
           
        // print unsorted arrays--
         System.out.println(" original arr: ");
        for(int i =0; i<arr.length; i++){
             System.out.print(arr[i]+ " ");
        }
           System.out.println();

           // print sorted arrays--
            Arrays.sort(arr, 1,3);
            //Arrays.sort(arr, Collections.reverseOrder());
             System.out.println(" Sorted arr: ");
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
             System.out.println();
        }}
        
