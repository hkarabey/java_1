package day24CustomMethodReturnMethod;

public class ReturnMethodPractıce2 {
    public static void main(String[] args) {

        //create a functıon that can calculate a grade
        //check the grade
        /*grade is
        a =excellent
        b: great
        .
        .
        */


        String res=grade(99);
        System.out.println(res);
        if (res.equals("A")){
            System.out.println("excellent");
        }else if (res.equals("B")){
            System.out.println("greet");
        }else if (res.equals("C")){
            System.out.println("good");
        }else if (res.equals("D")){
            System.out.println("not bad");
        }else {
            System.out.println("bad");
        }


    }

    public static String grade(int score){
        String  result="";
        if (score<=0||score>100){
            result="invalid";
        }else {
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        }
        return result;
    }



}
