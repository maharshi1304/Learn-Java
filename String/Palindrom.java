package github.maharshi1304.String;

public class Palindrom {
   public static boolean isPalindrome(String str){
    for(int i=0; i<str.length()/2;i++){
      //comparison
      int n = str.length();
      if(str.charAt(i)!= str.charAt(n-1-i)){
        return false;
      } 
     }
     return true;
   }


    public static void main (String a1[]){
       String str = "racecar";
       System.out.println(isPalindrome(str));
    }
    
}
