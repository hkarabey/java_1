package day50Collection;

import java.util.*;

public class RemoveEven {

    public static void main(String[] args) {

        List<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Iterator<Integer>it =numbers.iterator();

        while (it.hasNext()){

            if (it.next()%2==0){
                it.remove();
            }

        }
        System.out.println(numbers);

        System.out.println("-----------------");

        Set<Integer>set=new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

      //  set.removeIf(e->e%2==0);
       // System.out.println(set);


        Iterator<Integer>itSet=set.iterator();

        while (itSet.hasNext()){
            if (itSet.next()%2==0){
                itSet.remove();
            }

        }
        System.out.println(set);

    }


}
