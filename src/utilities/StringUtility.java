package utilities;

import java.util.Arrays;
import java.util.Locale;

public class StringUtility {

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            System.out.println(each);
        }

    }

    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=""+str.charAt(i);
        }

    return result;
    }

    public static boolean palindrom(String str){
     return reverse(str).equalsIgnoreCase(str);

    }
    public static int howManyPalindrom(String[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (palindrom(arr[i])){
                count++;
            }

        }
        return count;
    }

    public static boolean anagram(String e1,String e2){
        e1= e1.toLowerCase();
        e2=e2.toLowerCase();
        char[]ch1=e1.toCharArray();
        char[]ch2=e2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static String duplicatedWitout(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);
        }
return result;
    }

}
