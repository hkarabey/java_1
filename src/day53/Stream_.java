package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ {

    public static void main(String[] args) {

        System.out.println(".....distint.......collect....toArray.......");

        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,5,5,5,6,6));

        System.out.println(list);

        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 6};

        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("...........skip........");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list2);

        list2 = list2.stream().skip(3).collect(Collectors.toList());
        System.out.println(list2);

        int[] nums = {1, 2, 3, 4, 5};
        nums = Arrays.stream(nums).skip(2).toArray();
        System.out.println(Arrays.toString(nums));

        System.out.println("......limit.......");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list3);

        list3 = list3.stream().limit(5).collect(Collectors.toList());
        System.out.println(list3);

        System.out.println(".....map.........");

        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list4);
        list4=list4.stream().map(  p-> p*10  ).collect(Collectors.toList());

        System.out.println(list4);

        List<String>days=new ArrayList<>(Arrays.asList("monday","tuesday","wednesday","thursday","friday","saturday","sunday"));

        System.out.println(days);

        days=days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());

        System.out.println(days);



        System.out.println("......filter.........");

        List<Integer>list5=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list5);

        List<Integer>evens=list5.stream().filter(p->p%2==0).collect(Collectors.toList());

        System.out.println(evens);

        System.out.println("......count..........");

        List<String>list6=new ArrayList<>(Arrays.asList("java","java","JaVa","Pyhton","Ruby"));

        System.out.println(list6);

        long coun=list6.stream().filter(p->p.equalsIgnoreCase("java")).count();

        System.out.println(coun);


        System.out.println("....forEach......");

        list6.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));


        System.out.println(".........allMatch......anyMatch.......nonMatch....");

        List<Integer>list7=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        boolean r1=list7.stream().allMatch(p->p%2==0);

        System.out.println("r1 "+r1);

        boolean r2=list7.stream().anyMatch(p->p>8);

        System.out.println("r2 = " + r2);

        boolean r3= list7.stream().noneMatch(p->p%3==0);

        System.out.println("r3 = " + r3);


    }
}
