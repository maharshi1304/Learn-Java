package github.maharshi1304.String;

import java.util.*;
public class Strings {
  public static void printletters(String str){
    for(int i =0; i<str.length(); i++){
        System.out.print(str.charAt(i)+" ");
    }
     System.out.println();
  }
    
    public static void main(String[] args) {
        
        // Strings are IMMUTABLE 
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the name as String: ");
        String name = sc.nextLine();
        System.out.println(name);*/

        // Concatination 
        String firstname ="maharshi";
        String lastname ="mishra";
        String fullname = firstname+" "+lastname;
        System.out.println(fullname);
        // print a charcter from String
        System.out.println(fullname.charAt(0));
        System.out.println(fullname.length());

        // print all letter from String
        printletters(fullname);
    }
}
