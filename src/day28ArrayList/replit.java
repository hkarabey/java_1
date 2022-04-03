package day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class replit {
    public static ArrayList<Double> test (ArrayList<Double> dubs){
        //write code here
        ArrayList<Double>nums=new ArrayList<>();
        if(nums.size()>=2){
        nums.remove(1);}


        return nums;



    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextDouble());
        }

        System.out.println(test(list));

    }

}