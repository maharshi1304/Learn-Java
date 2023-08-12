package github.maharshi1304.Array;

public class WaterTrapping {
     public static int  trappedWater(int height[]){
        // calculate the leftmax boundary---

        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0]= height[0];
        for(int i =1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // calculate the rightmax boundary--

        int rightMax[] = new int[n];
            rightMax[n-1] = height[n-1];
            for(int  i = n-2; i>=0; i--){
                rightMax[i] = Math.max(rightMax[i+1], height[i]);
            }

        // calulate water level--
          int trappedWater = 0;
          for(int i = 0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // calculate trappedWater--
              trappedWater+= waterlevel-height[i]*1;

          }
              return trappedWater;
}
        public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappedWater(height)) ;
    }
    
}
