package day28ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit2{
        public static ArrayList<Double> test (ArrayList<Double> dubs){
    //write code here
    Scanner in = new Scanner(System.in);

    ArrayList<Double> nums = new ArrayList<>();
    for(int i=0; i < nums.size(); i++) {
        nums.add(in.nextDouble());
    }
    nums.remove(0);
    nums.remove(0);


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