package utilities;

import day34GarbageColectıon_AccesModifier.AccessModifier;

public class AccesModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData);
        //System.out.println(AccessModifier.privateData);
        //System.out.println(AccessModifier.defaultData);

        AccessModifier.method1();
        //AccessModifier.method2();it is default and we do not accces outside the package
        //AccessModifier.method3(); it is private we do not access outside the class




    }


}
