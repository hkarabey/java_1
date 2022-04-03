package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;


public class BulkOperatıon {
    public static void main(String[] args) {
//addAll


        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,2,2,2,2,3,3,3,3,3,3,3,4,5));
        System.out.println( list);

        //removeAll

        list.removeAll(Arrays.asList(2,3));
        System.out.println(list);

        System.out.println("------------");

        //retainAll

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,6,6,6,7,8,9));
        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(6,7));
        System.out.println(numbers);
        System.out.println("-------------");

        //containsAll

        ArrayList<String>jobTıtles=new ArrayList<>();
        jobTıtles.addAll(Arrays.asList("qa","develepor","sdet","qa","scrum master","ba","po","ba","sdet"));
        jobTıtles.retainAll(Arrays.asList("qa","sdet"));

        System.out.println(jobTıtles);

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1=nums.contains(10);
        System.out.println(r1);

        boolean r2=nums.contains(2) && nums.contains(5) && nums.contains(10);
        System.out.println(r2);

        boolean r3=nums.containsAll(Arrays.asList(2,5,11));
        System.out.println(r3);
        System.out.println("-----------------");

        //array and arraylist convert for non primitive
        String[]str={"josh","james","danıel","shay","bremma"};
        System.out.println(Arrays.toString(str));

        ArrayList<String >namesList=new ArrayList<>();
        namesList.addAll(Arrays.asList(str));
        System.out.println(namesList);

        ArrayList<String >namelist2=new ArrayList<>(Arrays.asList(str));
        System.out.println(namelist2);

        System.out.println("--------------");

       //convert for primitive it is not possıble

        int[]arr={1,2,3,4,5,6,7,8,9};
        // ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));

        System.out.println("--------------");

        int[]arr2={1,2,3,4,5,6};
        ArrayList<Integer>list3=new ArrayList<>();
        System.out.println(convertArrayToArrayList(arr2));


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer>list=new ArrayList<>();

        for (int each : array) {
            list.add(each);

        }
        return list;
    }

}
