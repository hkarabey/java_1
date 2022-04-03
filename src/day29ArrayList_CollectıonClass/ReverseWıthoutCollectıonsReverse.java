package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWıthoutCollectıonsReverse {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer>reverse=new ArrayList<>();

        for (int i = list.size()-1; i >=0; i--) {
            reverse.add(list.get(i));

        }
        System.out.println(reverse);



    }
}
