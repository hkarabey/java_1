package day53;

import javax.swing.*;
import java.util.*;
import java.util.function.*;

public class BuildInFunctionalInterface_Predicate {

    public static void main(String[] args) {

        System.out.println("........predicate..........");
        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        boolean result = isPalindrome.test(" java");
        System.out.println(result);


        Predicate<Integer> isEven = p -> p % 2 == 0;

        System.out.println("-------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        list.removeIf(isEven);

        System.out.println(list);
        System.out.println("------------------");
        List<String> names = new ArrayList<>(Arrays.asList("level", "anna", "java", "python"));

        names.removeIf((isPalindrome));
        System.out.println(names);

        System.out.println("----------------");

        System.out.println("..........consumer............");

        Consumer<String> printEach= (s)->{
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i)+" ");

            }
        };

        printEach.accept("wooden spoon");
        System.out.println("--------------------");

        List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

       /* for (Integer each : list1) {
            if (each%2==0){
                System.out.println(each);
            }
        }

        */
        list1.forEach(p-> {
        if (p%2==0) System.out.println(p);
        });

        List<String>names1=new ArrayList<>();
        names1.addAll(Arrays.asList("ayşen","gokcen","halil"));

        names1.forEach(p->{
            System.out.println(""+p.charAt(0)+p.charAt(p.length()-1));
        });

        System.out.println("......function.........");

        Function<int[], List<Integer>> convertToList=(arr)->{

            List<Integer>list2=new ArrayList<>();
            for (int each : arr) {
                list2.add(each+1);
            }
            return list2;
        };
        int[]numbers1={1,2,3,4,5};
        List<Integer> listToArrayList= convertToList.apply(numbers1);
        System.out.println(listToArrayList);

        System.out.println(".........BiPredicate............");


        BiPredicate<Integer[],Integer> contains=(arr, i)->{
            boolean result2=false;
            for (Integer each : arr) {
                if (each==i){
                    result2=true;
                    break;
                }
            }
            return result2;
        };

        Integer[]arr={1,2,3,4,5,6,7,8,9};

        boolean r1=contains.test(arr,10);
        System.out.println(r1);

        System.out.println("--------");

        BiPredicate<String,String>isAnagram=(a,b)->{
            String[]arr1=a.split("");
            String[]arr2=b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr2,arr1)){
                return true;
            }else {
                return false;
            }
        };

        String str1="asd";
        String str2="dsa";
        boolean r2=isAnagram.test(str1,str2);
        System.out.println(r2);

        System.out.println("........BiConsumer......");

        BiConsumer<String,Integer>multipleTimesPrint=(s,i)->{

            for (int i1= 0; i1<i; i1++) {
                System.out.println(s);

            }


        };
        multipleTimesPrint.accept("wooden spoon",3);



        Map<String,String>namesOfEmployment=new LinkedHashMap<>();
        namesOfEmployment.put("Halil","sdet");
        namesOfEmployment.put("ceyda","dev");
        namesOfEmployment.put("gonca","scrumMaster");
        namesOfEmployment.put("sümeyye","po");
        namesOfEmployment.put("nesrin","ba");

        namesOfEmployment.forEach( (k,y)->{
        System.out.println(k+y);});

/*
        for (Map.Entry<String, String> eachEntry : namesOfEmployment.entrySet()) {
            String k=eachEntry.getKey();
            String v=eachEntry.getValue();
        }
*/

        System.out.println("..........BiFunction........");

        BiFunction<Integer, Integer, Integer> maxInteger = (n1, n2) -> {

            if (n1 > n2) {
                return n1;
            } else {
                return n2;
            }

        };

        int max = maxInteger.apply(100, 200);
        System.out.println(max);


        BiFunction<int[], int[], List<Integer>> merge = (l1, l2) -> {

            List<Integer> result3 = new ArrayList<>();
            for (int each : l1) {
                result3.add(each);
            }
            for (int each : l2) {
                result3.add(each);
            }
            return result3;
        };
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {6, 7, 8, 9};
        List<Integer> last = merge.apply(arr3, arr4);
        System.out.println(last);

        System.out.println("-------");

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeList = (l3, l4) -> {
            Map<String, Integer> mergeMap = new LinkedHashMap<>();

            for (int i = 0, j = 0; i < l3.size(); i++, j++) {

                mergeMap.put(l3.get(i), l4.get(j));
            }
            return mergeMap;
        };
        List<String> a1 = new ArrayList<>(Arrays.asList("hail", "eda"));
        List<Integer> a2 = new ArrayList<>(Arrays.asList(100, 200));

        Map<String, Integer> LASTmAP = mergeList.apply(a1, a2);
        System.out.println(LASTmAP);

    }

}
