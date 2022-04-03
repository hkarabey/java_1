package day07Operators;

public class AverageScoreCasting {
    public static void main(String[] args) {
       float averageScore=20.5f;
        System.out.println("averageScore = " + averageScore);

        byte num1=(byte)averageScore;//explicit casting
        short num2=(short) averageScore;
        int num3=(int)averageScore;
        long num4=(long) averageScore;
        float num5=averageScore;//no casting
        double num6=(double) averageScore;//implicit casting
                                            //java done outomaticly
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num6 = " + num6);


    }




}
