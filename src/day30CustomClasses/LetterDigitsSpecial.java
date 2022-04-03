package day30CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LetterDigitsSpecial {

    public static void main(String[] args) {

        String str="qwdfgnbvc1234567<>£#$½";



        ArrayList<Character>listarr=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            listarr.add(str.charAt(i));

        }
        System.out.println(listarr);

        ArrayList<Character>specials=new ArrayList<>(listarr);

        specials.removeIf(p-> (p>'0'&&p<'9' || p>'a'&&p<'z'));
        System.out.println(specials);



        ArrayList<Character>letters=new ArrayList<>(listarr);

        letters.removeIf(p-> !(Character.isLetter(p)));
        System.out.println(letters);


        ArrayList<Character>digits=new ArrayList<>(listarr);

       digits.removeIf(p-> !(p>'0'&&p<'9'));
        System.out.println(digits);

    }
}
