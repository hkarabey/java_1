package utilities;

import day40FinalKeyWord.ProtectedAccessModifier;

public class AcceModifierTest {
    public static void main(String[] args) {

        // default is not allowed to access outside the package       System.out.println(ProtectedAccessModifier.name1);
        // protected is not allowed to access outside the package if it is not subclass      System.out.println(ProtectedAccessModifier.name2);


    }


}
