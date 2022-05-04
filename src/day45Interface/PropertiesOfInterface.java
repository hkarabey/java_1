package day45Interface;

public interface PropertiesOfInterface {
    public int a=100; //static &final is default
    public static int b=200;//final is default

    /*
    public PropertiesOfInterface(int a) {
        this.a = a;
    }
    */

    /*
    static {
        b = 100;
    }*
    /
    /*
    public void methd1(){
        System.out.println("instance method");
    }
    */
    public static void method2(){
        System.out.println("static method");
    }
    public abstract void method3();

    public default void method4(){
        System.out.println("default method");
    }


}
class Test implements PropertiesOfInterface{


    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method3();//method4();
        PropertiesOfInterface.method2();
    }

}
