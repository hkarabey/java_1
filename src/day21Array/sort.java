package day21Array;

import java.util.ArrayList;
import java.util.Arrays;

public class sort {

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 6, 7, 5};

        ArrayList<Integer> newA = new ArrayList<>();
        ArrayList<Integer> sort = new ArrayList<>();

        for (int each : arr) {
            newA.add(each);
        }
        System.out.println(newA);

        while (true) {

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < newA.size(); i++) {
                if (newA.get(i) < min) {
                    min = newA.get(i);

                }

            }
            sort.add(min);

            for (int i = 0; i < sort.size(); i++) {

                newA.remove(sort.get(i));
            }

            if (newA.size() == 0) {
                break;
            }
        }

        int[] sor1 = new int[sort.size()];

        for (int i = 0, j = 0; i < sort.size(); i++, j++) {

            sor1[j] = sort.get(i);
        }
        System.out.println(sort);

        System.out.println(Arrays.toString(sor1));

    }
}