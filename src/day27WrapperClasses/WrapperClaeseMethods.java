package day27WrapperClasses;

public class WrapperClaeseMethods {

    public static void main(String[] args) {

        String str="123";
        int num=Integer.parseInt(str);//ınt

        System.out.println(str+1);//1231
        System.out.println(num+1);//124

        String str2="10.5";
        double num2=Double.parseDouble(str2);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println(max2);
        System.out.println(min2);

        String str3="true";
        boolean b3=Boolean.parseBoolean(str3);

        System.out.println("-----------------");

        String s5 = "123";

        Integer s5i1 = Integer.valueOf(s5);
        int s5i = Integer.valueOf(s5);//integer
        System.out.println("------------");

        //isDigit
        char ch = '0';
        boolean r2 = Character.isDigit(ch);
        System.out.println(r2);
//isLetter
        boolean r3=Character.isLetter(ch);
        System.out.println(r3);
//isSpecial
        boolean r4=Character.isLetterOrDigit(ch);
        System.out.println(r4);

        //isUppercase
        boolean r5=Character.isUpperCase(ch);
        System.out.println(r5);

        //isLovvercase

        boolean r6=Character.isLowerCase(ch);
        System.out.println(r6);

        System.out.println("------------");

        String st="ab1cde2efg3h14";
        int sum=0;
        for (char each : st.toCharArray()) {
            if( Character.isDigit(each) ){
                sum+=Integer.parseInt(""+each);
            }
            
        }
        System.out.println("sum: "+sum);
    }


}
