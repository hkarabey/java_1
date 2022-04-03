package day32CustomClass_Cunstructor;

public class Test {

    public Test(){
        System.out.println("a");
    }

    public Test(int a){//a b
        this();
        System.out.println("b");
    }
    public Test(double a){//a b c
        this(10);
        System.out.println("c");
    }
    public Test(String str){//a b c d
        this(2.5);
        System.out.println("d");
    }

    public static void main(String[] args) {
        new Test(10.5);
    }

}
