package day09İfElseBranchİf;

public class MinimalNumberWithelse {
    public static void main(String[] args) {

        int n1=12,
                n2=13;
        if(n1>n2){
            System.out.println("max number is "+n1);
        }
        else{
            System.out.println("max number is "+n2);
        }
        System.out.println("------------");
        if (n1<n2){
            System.out.println("mın number is "+n1);
        }
        else{
            System.out.println("mın number is "+n2);
        }
        System.out.println("-------");

        int age =21;
        if (age>18){
            System.out.println("you can buy alcohol");
        }
        else{
            System.out.println("you canot buy alcohol");
        }

        System.out.println("----------");
        int age1=19;
        if (age1>=19){
            System.out.println("you are eligible for vote");
        }
        else
        {
            System.out.println("you are not eligible for vote");
        }
    }
}
