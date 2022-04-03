package day05Concetanation;

public class FullName {
    public static void main(String[] args) {
        String first_name = "halil ibrahim";
        String lastName = " karabey";
        int age=34;
        String jobTitle="SDET";
        String companyName="\"Apple İnc\"";
double salary=100000;

        String fullName = first_name + lastName;
        System.out.println(first_name + lastName);
        System.out.println(fullName);
// fullname of the person is...
        System.out.println("full name of the person is"+" "+fullName);

        //...is ...yearsold

        System.out.println(fullName+" is "+age+" years old.");

        //halil is sdet and works ata companyname

        System.out.println(fullName+" is "+jobTitle+" and works at "+companyName+" "
                +fullName+"'s salary is "+salary);

    }


}
