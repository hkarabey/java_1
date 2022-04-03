package day34GarbageColectıon_AccesModifier;

public class StaticMembers {

    //nested class and inner
    static class class1 {

    }

    //variables
    public static int num = 10;

    //method
    public static void method() {

    }

    //static block
    static {

    }

}

class A{
    static class B{

        public static void method1(){

        }

    }
}

class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}

class X{

}
class Y{

}
class Z{
    static class Q{

    }
}