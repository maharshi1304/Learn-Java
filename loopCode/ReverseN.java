
/*print Reverse OF a Number 
public class ReverseN {
    public static void main(String[] args) {
        int n = 23456;
        while( n > 0){
            int lastDigit = n%10;
            System.out.print(lastDigit+" ");

            n = n/10;
        
    }
    
}
} */
  //Print Reverse of  Number at Unit Place

  public class ReverseN{
    public static void main(String[] args) {
        int n  = 10899;
        int rev = 0;
        while( n > 0){
        int lastdigit = n%10;
        rev = (rev*10) + lastdigit;
        n = n/10;
    }
      System.out.print(rev);
  }
  }
    
