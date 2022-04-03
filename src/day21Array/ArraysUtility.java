package day21Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,};
        System.out.println(nums);//hashcode
        System.out.println(Arrays.toString(nums));//arrays
        System.out.println(nums[0]);//elements

        String str="java";

        System.out.println(str);
        System.out.println(str.toString());


        System.out.println("-----------------");

        int []scores={95,100,55,65,85,75};

        System.out.println(Arrays.toString(scores));
        
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("min scores: "+scores[0]);
        System.out.println("max scores: "+scores[scores.length-1]);

    String[]names={"anna","ahmet","gunay","zuhal","maria","maanna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-------------");

        String[]names1={"anna","ANNA"};
        Arrays.sort(names1);
        System.out.println(Arrays.toString(names1));

        System.out.println("-------------------------");

        int []num1={1,3,2};
        int []num2={1,2,3};
        boolean e=Arrays.equals(num1,num2);
        System.out.println(e);

        Arrays.sort(num1);
        Arrays.sort(num2);

        boolean e2=Arrays.equals(num1,num2);
        System.out.println(e2);

        System.out.println("-----------------");

        char[]ch={'a','c','b'};
        char[]ch1={'b','a','d'};

        Arrays.sort(ch);
        Arrays.sort(ch1);
        boolean anagram=Arrays.equals(ch,ch1);
        if (anagram==true){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }




    }



}
