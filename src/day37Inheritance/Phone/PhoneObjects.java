package day37Inheritance.Phone;

public class PhoneObjects {
    public static void main(String[] args) {

       IPhone iPhone1=new IPhone("A","se","small",12000,"white");

       Samsung samsung1=new Samsung("S","devsa","big",10000,"black");

       Nokia nokia1=new Nokia("n","3310","middle",12000,"gray");

        System.out.println(iPhone1);
        iPhone1.text(555_234_12_23l);

        System.out.println("-----------");

        System.out.println(samsung1);
        samsung1.text(555_213_21);
        System.out.println("--------------");

        System.out.println(nokia1);
        nokia1.call(555_213_32_43l);
        nokia1.selfDefence();

    }

}
