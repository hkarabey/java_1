package day09İfElseBranchİf;

public class MedianNumber {
    public static void main(String[] args) {
        int n1=30;
        int n2=5;
        int n3=10;

        boolean mediann1=n2>n1&&n1>n3||n1>n2&&n3>n1;
        boolean mediann2=n2>n1&&n3>n2||n2>n3&&n1>n2;
        boolean mediann3=n3>n1&&n2>n3||n3>n2&&n1>n3;
    if (mediann1){
        System.out.println("median number is "+n1);
    }
        if (mediann2) {
            System.out.println("median number is "+n2);
        }
        if (mediann3){
            System.out.println("median number is "+n3);
        }


    }

}
