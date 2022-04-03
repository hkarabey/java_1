package day22DimensinolArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int []arr1={1,2,3};
        int []arr2={1,2,3};
        int []arr3={1,2,3};
        int[][]arr2D={{1,2,3},{4,5,6},{7,8,9}};

//3 DİMENSİONAL ARRAYS CONTAİNS 2 DİMENSİONAL ARRAY

        int[][][]arr3D={ {{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{40,50,60},{70,80,90}} };
       //           İNDEX           0                       1
//                           0       1       2           0           1           2
   //                      0 1 2    0 1 2   0 1 2     0 1 2      0 1 2       0  1 2

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][1][1]);

        System.out.println("--------");

        for(int[][]each2D :arr3D){
            for (int []each1D:each2D){
                for (int element:each1D){
                    System.out.print(element+" ");
                }
            }
        }
        }

}
