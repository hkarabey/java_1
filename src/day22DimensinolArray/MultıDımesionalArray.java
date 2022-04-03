package day22DimensinolArray;

import java.util.Arrays;

public class MultıDımesionalArray {

    public static void main(String[] args) {

        String[] group1={"john","joe","james"};
        String[] group2={"john","joe","james"};
        String[] group3={"john","joe","james"};

        String [][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------");

       int[][]nums={ {1,2} ,{3,4,5},{6,7,8,9}};
        System.out.println(Arrays.deepToString(nums));

        System.out.println(Arrays.toString(nums[1]));

        System.out.println(nums[1][2]);

        int index= nums.length;
        System.out.println(index);

        int indexOfTwoElenets=nums[2].length;
        System.out.println(indexOfTwoElenets);
    }


}
