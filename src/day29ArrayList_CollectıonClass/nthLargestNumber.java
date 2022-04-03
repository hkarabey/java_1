package day29ArrayList_CollectıonClass;

import java.rmi.server.ServerNotActiveException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class nthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 4, 2, 7, 4, 9, 0, 6, 11, 56, 34, 57, 12));
        ArrayList<Integer> sorting = new ArrayList<>();



        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        int n = scan.nextInt();



        int count = 0;

        while (true) {

            int max=Collections.max(numbers);

            sorting.add(max);
            numbers.removeIf(p->p== Collections.max(numbers));
            count++;

            if (n == count) {
                System.out.println(sorting.get(count - 1));
                break;
            }


        }
scan.close();
    }


}
