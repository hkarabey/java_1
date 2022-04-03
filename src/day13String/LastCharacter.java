package day13String;

public class LastCharacter {
    public static void main(String[] args) {
        String s1="asafsdfcfşlsv ŞEC <WEŞEF EDŞLF.<";
        int totalChar=s1.length();
        System.out.println("totalChar = " + totalChar);


        char lastChar=s1.charAt( s1.length()-1 );
        System.out.println("lastChar = " + lastChar);


    }


}
