public class Operation {
    public static void IthBit(int n, int i){
        // GET Ith BIT
        if((n & (1 << i)) == 0){  // 1 << i will shift 1 to left i times
            System.out.println("Ith bit is :"+0);
        }else{
            System.out.println("Ith bit is not :"+1);
        }
        return;
    }

        // SET Ith BIT
        public static int setIthBit(int n, int i){
            return (n | (1 << i));
        }

        // Clear Ith Bit
        public static int clearIthBit(int n, int i){
            return (n &(~(1 << i)));
        }

        // Update Ith Bit
        public static int updateIthBit(int n, int i, int newbit){
            
            if(newbit  == 0 ){
                return clearIthBit(n, i);
            }else{
                return setIthBit(n, i);
            }
            
            // n = (n & (~(1 << i)));
            // return (n | (v << i));
        }

        // Clear last i bits
        public static int clearLastIBits(int n, int i){
            return (n & (~(0) << i));
        }

        //Clear range of bits
        public static int clearRangeOfBits(int n, int i, int j){
            int a = (~0) << (j+1);
            int b = (1 << i) - 1;
            int mask = a | b;
            return (n & mask);  // or return (n & (a | b));
           }
    public static void main(String[] args) {
        IthBit(10, 2);
        System.out.println(setIthBit(10, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(updateIthBit(10, 2, 1));

        System.out.println(clearLastIBits(15, 2));

        System.out.println(clearRangeOfBits(10, 2, 4));
    }
    
}
