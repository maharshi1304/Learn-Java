package github.maharshi1304.String;

public class SubString {

    public static String substring(String str, int si, int en){
        String substr = " ";
        for(int i = si; i < en ; i++ ){
             substr+= str.charAt(i);
        }
         return substr;
     }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,6));
    }
    
}
