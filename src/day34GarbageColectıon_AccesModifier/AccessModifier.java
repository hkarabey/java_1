package day34GarbageColectıon_AccesModifier;

public class AccessModifier {

    public static int publicData=100;
           static int defaultData=200;
    private static int privateData=300;


    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);


    }

    public static void method1(){
        System.out.println("public method");
    }
          static void method2(){
              System.out.println("default method");
          }
    private static void method3(){
        System.out.println("public method");
    }


}
