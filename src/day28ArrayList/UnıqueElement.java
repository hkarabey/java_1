package day28ArrayList;

import java.util.ArrayList;

public class UnıqueElement {
    public static void main(String[] args) {

        ArrayList<String> elements=new ArrayList<>();
        elements.add("java");
        elements.add("java");
        elements.add("java");
        elements.add("python");
        elements.add("c#");
        elements.add("c#");
        elements.add("ruby");
        elements.add("c++");
        elements.add("c++");

        System.out.println(elements);

        ArrayList<String> unıque=new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            String str=elements.get(i);
            if (elements.indexOf(str)==elements.lastIndexOf(str)){
                unıque.add(str);

            }
        }
        System.out.println(unıque);
    }






}
