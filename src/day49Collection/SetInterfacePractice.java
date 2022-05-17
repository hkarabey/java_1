package day49Collection;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {



        Set<Integer> hashSet=new HashSet<>();

        Set<Integer>linkedHashSet=new LinkedHashSet<>();

        Set<Integer>treeSet=new TreeSet<>();

        System.out.println("----------------");

        hashSet.addAll(Arrays.asList(10,20,30,40,50,50));
        System.out.println(hashSet);
        hashSet.addAll(Arrays.asList(null,null,null));
        System.out.println(hashSet);

        hashSet.addAll(Arrays.asList(null,null,null));
        System.out.println(hashSet);

        System.out.println("-------------");

        linkedHashSet.addAll(Arrays.asList(10,30,19,45,89));
        System.out.println(linkedHashSet);
        linkedHashSet.addAll(Arrays.asList(12,12));
        System.out.println(linkedHashSet);

        System.out.println("------------");

        treeSet.addAll(Arrays.asList(10,78,98,45,30));
        System.out.println(treeSet);
        treeSet.addAll(Arrays.asList(15,15,15));
        System.out.println(treeSet);

        try {
            treeSet.add(null);
        }catch (NullPointerException e){
            System.out.println(treeSet);
        }


    }


}
