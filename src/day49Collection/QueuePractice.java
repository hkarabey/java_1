package day49Collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> p1 = new PriorityQueue<>();

        p1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("priority Queue "+p1);
        p1.poll();
        System.out.println(p1);

        System.out.println("-----------");

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("--------------");

        Queue<Integer>linkedList=new LinkedList<>();

        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        linkedList.poll();
        System.out.println(linkedList);
    }


}