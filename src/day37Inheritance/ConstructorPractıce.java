package day37Inheritance;



class A{
    public int a;
    public A(int a){
        this.a=a;
        System.out.println("A");
    }
}
class B extends A{
    public B(int a){
        super(a);
        System.out.println("B");
    }
}




public class ConstructorPractıce {

    public static void main(String[] args) {

        B obj=new B(12);



    }

}
