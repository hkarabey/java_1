package day28ArrayList;

public class StrongPassWordBeforeIntro {

    public static void main(String[] args) {

        String passWord="A/@12asd";

        boolean r1=passWord.length()>=8&&!passWord.contains(" ");

        boolean r2=false;
        boolean r3=false;
        boolean r4=false;
        boolean r5=false;

       char[] chars=passWord.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2=true;
            }
            else if (Character.isLowerCase(each)){
                r3=true;
            }
            else if (Character.isDigit(each)){
                r4=true;
            }
            else{
                r5=true;
            }
        }

if (r1==true&&r2==true&&r3==true&&r4==true&&r5==true){
    System.out.println("strong password");
}else{
    System.out.println("it is not strong password");
}
    }



}
