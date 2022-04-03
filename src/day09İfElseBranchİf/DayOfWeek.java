package day09İfElseBranchİf;

public class DayOfWeek {
    public static void main(String[] args) {
        int n=7;//1~7
        String day;
        if (n==1){
            //System.out.println("Monday");
        day="monday";
        }
        else if (n==2){
            //System.out.println("Tuesday");
        day="tuesday";
        }
        else if (n==3){
           // System.out.println("Wednesday");
        day="wednesday";
        }
        else if (n==4){
            //System.out.println("Thursday");
        day="thursday";
        }
        else if (n==5){
            //System.out.println("Friday");
        day="friday";
        }
        else if (n==6){
            //System.out.println("Saturday");
        day="saturday";
        }
       else {
            //System.out.println("Sunday");
        day="sunday";
        }
        System.out.println("day = " + day);

    }


}
