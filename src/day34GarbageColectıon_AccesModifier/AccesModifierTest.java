package day34GarbageColectıon_AccesModifier;

public class AccesModifierTest {

    public static void main(String[] args) {

        System.out.println(AccessModifier.publicData);
        System.out.println(AccessModifier.defaultData);
        //System.out.println(AccessModifier.privateData);private is not reachable

        AccessModifier.method1();
        AccessModifier.method2();
        //AccessModifier.method3(); it is prive method and we do not acces outside the class


    }


}
