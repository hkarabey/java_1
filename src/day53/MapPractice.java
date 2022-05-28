package day53;

import jdk.dynalink.linker.LinkerServices;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("print sttament", 6.0);
        unit1.put("escape", 12.0);
        unit1.put("primitives", 6.0);
        unit1.put("operators", 9.0);
        unit1.put("if statement", 9.0);
        unit1.put("switch staememnt", 4.0);
        unit1.put("scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit1.put("String manuplating", 12.0);
        unit1.put("loops", 17.5);
        unit1.put("branching staement", 1.5);
        unit1.put("Arrays", 14.5);
        unit1.put("custom MEthods", 16.5);
        unit1.put("Wrapper classes", 3.0);
        unit1.put("scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("custom methods", 16.5);
        unit3.put("wrapper classes", 3.0);
        unit3.put("arrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("custom class", 23.5);
        unit4.put("Access modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("encapsulatıon", 4.5);
        unit5.put("inheritance", 13.5);
        unit5.put("abstrauct", 2.5);
        unit5.put("pollyMorphism", 11.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("collection", 9.5);
        unit6.put("map", 12.0);
        unit6.put("final kyword", 2.5);
        unit6.put("exception", 8.5);

        List<Map<String, Double>> allUnits = new ArrayList<>();

        allUnits.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));

        System.out.println(allUnits);
        System.out.println("------------");

        //java topics and hours

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachLesson : eachUnit.entrySet()) {
                System.out.println(eachLesson.getKey() + " = " + eachLesson.getValue());
            }
        }
        System.out.println("---------------");
//more than 7 hours

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachLesson : eachUnit.entrySet()) {
                if (eachLesson.getValue() > 7.0) {
                    System.out.println(eachLesson.getKey());
                }
            }
        }
        System.out.println("--------------");
//less than 3 hours

        for (Map<String, Double> eachUnits : allUnits) {
            for (Map.Entry<String, Double> eachLesson : eachUnits.entrySet()) {
                if (eachLesson.getValue() < 3.0) {
                    System.out.println(eachLesson.getKey());
                }
            }
        }
        System.out.println("------------");
        //minimum hours lesson

        double min = Double.MAX_VALUE;
        String lessonHasMinHour = "";

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachLesson : eachUnit.entrySet()) {
                if (eachLesson.getValue() < min) {
                    min = eachLesson.getValue();
                    lessonHasMinHour = eachLesson.getKey();

                }
            }
        }

        System.out.println("lessonHasMinHour = " + lessonHasMinHour);

    }


}
