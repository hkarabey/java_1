package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UnıqueCharacter {
    public static void main(String[] args) {

        String str="aaabbbcccdeff";

        String[]str1=str.split("");//to charArray yaparsak, chara dödürür non primitive olmadığı için olmaz

        ArrayList<String> list=new ArrayList<>(Arrays.asList(str1));
        ArrayList<String> uniq=new ArrayList<>();

        System.out.println(list);

        for (String each : list) {
            if (Collections.frequency(list,each)==1){
                uniq.add(each);
            }

        }
        System.out.println(uniq);

        System.out.println("-------------");


        String str2="aaabbbcccdeff";

        String[]str3=str.split("");//to charArray yaparsak, chara dödürür non primitive olmadığı için olmaz

        ArrayList<String> list1=new ArrayList<>(Arrays.asList(str3));

        String unıque="";

        for (String eac1 : list1) {

           int freq= Collections.frequency(list1,eac1);
            if (freq==1){
                unıque+=eac1;

            }

        }
        System.out.println(unıque);
    }



}
