package day34GarbageColectıon_AccesModifier;

public class ConstructorVsStaticBlock {

    static {

        System.out.println("static block");
    }
    public ConstructorVsStaticBlock(){
        System.out.println("constructor");
    }



    public static void main(String[] args) {
        System.out.println("main method");

        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();







    }

}
