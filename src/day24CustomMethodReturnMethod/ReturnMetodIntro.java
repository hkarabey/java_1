package day24CustomMethodReturnMethod;

public class ReturnMetodIntro {
    public static void main(String[] args) {

        String str="java";
        String result=reverse(str);
        System.out.println(result);

       // reverse(str);
    }
    public static String reverse(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);

        }
      return reverse;
    }

}
