package day23CustomMethodIntro;

import java.util.Scanner;

public class Replit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result1 = 0;
        int result2 = 0;

        int i=0;
        int j=0;
        for(i=0,j=0;i<=2;i++,j++) {
            result1 += matrix[i][j];
        }
        int k=0;
        int l=2;
        for(k=0,l=2;k<=2;k++,l--) {

            result2 += matrix[k][l];
        }

        int result=0;
        if(result1>result2){
            result=result1-result2;}
        else{
            result=result2-result1;   }




        // FINAL PRINT
        System.out.println(result);
    }
}