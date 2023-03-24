import java.io.*;
 
public class count1{
 
    static int countDigit(long n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
 
    /* Driver code */
    public static void main(String[] args)
    {
        long n = 567895;
        System.out.print("Number of digits : " + countDigit(n));
                         
    }
}