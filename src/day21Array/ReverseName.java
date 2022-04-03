package day21Array;

public class ReverseName {
    public static void main(String[] args) {

        String names[]={"cydeo scholl","wooden spoon", "java programmıng",
                "sql programmıng","selenıum otomatıon",
                "apı testing","database testing","manual testing"};

        for (String each : names) {
            String reversed="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
