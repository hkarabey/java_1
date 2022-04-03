package day32CustomClass_Cunstructor;

public class ConstructorCalls {
public int age;


    public  ConstructorCalls(){

        System.out.println("default Constructor");
    }

    public ConstructorCalls(int a){
        this();//because default constructor

        System.out.println("Constructor with int arg.");
    }

    public ConstructorCalls(String name){
        this(10);

    }

    public String toString() {
        return "ConstructorCalls{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {

        ConstructorCalls obj1=new ConstructorCalls();
        ConstructorCalls obj2=new ConstructorCalls(10);
        ConstructorCalls obj3=new ConstructorCalls("ali");


    }

}
