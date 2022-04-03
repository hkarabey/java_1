package day05Concetanation;

public class ShippingAddres {
    public static void main(String[] args) {

/*
String name="james";

String buıldNumber="1125B";
*/


         String name="james jolly",
                buildNumber="12312B",
                streetName="john branch Dr",
                city="Mc Lean",
                zipCode="20125";
        /*
String name="james";
String buildNumber="12312B";
String streetName="john branch Dr";
String city="Mc Lean";
String zipCode="20125";
*/

        //System.out.println(name+"\n"+buildNumber+" "+streetName+"\n"+city+" "+zipCode);
String address=name+"\n"+buildNumber+" "+streetName+"\n"+city+" "+zipCode;
        System.out.println(address);
    }

}
