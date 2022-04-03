package day08İf;

public class LogicalOperators {
    public static void main(String[] args) {

        String name="Steve";
        int age=19;
        String citizen="USA";
        boolean isEligible=age>=18&&citizen=="USA";
        System.out.println(name+" is eligible to vote: "+isEligible);
String name1="Aaron";
int age1=19;
String citizen1="UK";
boolean isEligible1= age1>=20||citizen1=="UK";
        System.out.println(name1+" is eligible for staying in UK: "+isEligible1);

        String name2="Josh";
        int creditScore=720;
        int age2=23;
        boolean eligibleForLoan= creditScore>=700&&age2>=24;
        System.out.println(name2+" is eligible for loan: "+eligibleForLoan);

        String name3="Shay";
        int age3 =21;
        char gender='F';
        boolean isEligible3= age3>=18 && (gender=='M' || gender=='F');
                              //21>=18 true    &&    (false||ture)->true
        System.out.println(name+ " is eligible for selecting: "+isEligible3);

        String name4="James";
        String contryOfBırd="USA";
        boolean marriedoUSCitizen=false;
        boolean isEligible4=contryOfBırd=="USA"||marriedoUSCitizen==true;
        System.out.println(name4+" is eligible for USA citizenShip: "+isEligible4);

        boolean result2=true;
        System.out.println("result2 = " + result2);
        boolean resut3=!result2;
        System.out.println("resut3 = " + resut3);
        int score =84;
        boolean pastLesson=score>=60;
        boolean failed=!pastLesson;
        System.out.println("pastLesson = " + pastLesson);
        System.out.println("failed = " + failed);





    }


}
