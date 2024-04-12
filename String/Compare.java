package github.maharishi1304.String;

public class Compare {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        //Comapare
        if(s1==s2){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not  equal");
        }
         // equals function use--
        if(s1.equals(s3)){
            System.out.println("String are equal");
        }
          else{
            System.out.println("String are not equal");
          }
    }
    
}
