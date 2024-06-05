
import java.util.Arrays;

public class Anagram {
    public static boolean areAnagram(String str1, String str2) {
        
        // convert the two strings in lowercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check the length of the two strings
        if(str1.length() != str2.length())
            return false;
        
        // covert the two strings into char array
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        // sorting the two char array
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        String str1= "race";
        String str2 = "care";

        if(areAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}
