package day17WhileLoop;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str="aabbcc";
        String result="";//abc
        for (int i = 0; i <str.length() ; i++) {
           String ch=""+str.charAt(i);
            if (result.contains(ch)){
                continue;
            }
            result+=ch;

        }
        System.out.println(result);
    }





}
