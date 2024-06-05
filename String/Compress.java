public class Compress {
    public static String compress(String str){
       String compressed = " ";
        Integer count = 1;
        for(int i=0; i<str.length(); i++){
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
             compressed+= str.charAt(i);
             if(count>1){
                 compressed+= count.toString();
             }
            }
            return compressed;
        }
        
    //     for(int i = 0; i<str.length()-1; i++){
    //         if(str.charAt(i)==str.charAt(i+1)){
    //             count++;
    //         }else{
    //             compressed+= str.charAt(i)+""+count;
    //             count = 1;
    //         }
    //     }
    //     compressed+= str.charAt(str.length()-1)+""+count;
    //     return compressed;
    // }  

    // public static String compress(String texto){

    //     StringBuilder objString = new StringBuilder();
    
    //     int count;
    //     char match;
    
    //         count = texto.substring(texto.indexOf(texto.charAt(1)), texto.lastIndexOf(texto.charAt(1))).length()+1;
    //         match = texto.charAt(1);
    //         objString.append(count);
    //         objString.append(match);
    
    //     return objString.toString();
    // }
    public static void main(String[] args) {
String str = "abc";
  System.out.println(compress(str));
    }
    
}
