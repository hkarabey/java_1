package day21Array;

public class ForEachLoopPractıce {
    public static void main(String[] args) {
//first and last character for each words
        String[]words={"java programmıng","cydeo school","wooden spoon","early birds","angry birds"};

        for (String each : words) {
            System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));

        }


    }



}
