package day14String;

public class EmailAddress {

    public static void main(String[] args) {
        String email1="cydeo.school@gmail.com";
        String email2="cydeo.school@yahoo.com";
        String email="cydeo.school@yahoo.com";
        if(email==email1){
            email=email1.substring(email1.indexOf("@")+1,email1.lastIndexOf("."));
            System.out.println("email = " + email);

        }else{
            email=email2.substring(email2.indexOf("@")+1,email2.lastIndexOf("."));
            System.out.println("email = " + email);

            System.out.println(" ----------------------");

            String str="Java is fun, Java is cool. I love Java";//ı want to read java is fun
            int endingİndex=str.lastIndexOf(",");

            String strsub=str.substring(0,endingİndex);
            System.out.println("strsub = " + strsub);

           String str2= str.substring(str.indexOf(" J")+1,str.lastIndexOf("."));
            System.out.println("str2 = " + str2);

            String str3=str.substring(str.indexOf("I"));
            System.out.println("str3 = " + str3);

        }

    }


}
