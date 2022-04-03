package day22DimensinolArray;

import java.util.Arrays;
import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int nunD=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }


                }
            if(count==1){
                nunD=nums[i];
            }

        }
        System.out.println(nunD);

    }
}