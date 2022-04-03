package day21Array;

    import java.util.*;

    class Main {
        public static int[][] scalar(int[][] matrix ,int n) {
            int[][]a=new int[matrix.length][matrix.length];
            for(int i=0,k=0;i<matrix.length;i++,k++){
                for(int j=0,l=0;j<matrix[i].length;j++,l++){
                    a[k][l]=matrix[i][j]*n;
                }
            }

            return a;
        }

        public static void main(String[] args)
        {

            int [][] i= new int[][]
                    {
                            {1,1,1},
                            {1,1,1}
                    };
            i = scalar(i,2);
            System.out.println(Arrays.deepToString( i ));

        }//end main
    }


