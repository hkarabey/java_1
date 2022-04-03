package day24CustomMethodReturnMethod;

public class ReturnPractice4 {

    public static void main(String[] args) {

//create a method that can remove duplıcated character from a string and returns the new value

       String result=dublicated("aabbbccccdde");
        System.out.println(result);
    }



    public static String dublicated(String str){
        //aaabbbcc
        String result="";
        for (int i=0;i<str.length();i++){
char each =str.charAt(i);
           if (!result.contains(each+"")) {

               result += each;
           }

        }

        return result;
    }


}
