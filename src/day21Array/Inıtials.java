package day21Array;

public class Inıtials {
    public static void main(String[] args) {
        String names[]={"cydeo scholl","wooden spoon", "java programmıng",
                "sql programmıng","selenıum otomatıon",
                "apı testing","database testing","manual testing"};
        for (String each : names) {
            System.out.print(each.substring(0,1)+each.substring(each.indexOf(" ")+1,each.indexOf(" ")+2)+ " ");

        }
        System.out.println();
        for (String each : names) {
String initial=each.charAt(0)+"."+each.charAt( each.indexOf(" ")+1)+" ";
            System.out.print(initial);
        }

    }


}
