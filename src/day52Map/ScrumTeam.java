package day52Map;

import java.util.*;

public class ScrumTeam {
    public static void main(String[] args) {

        Map<String, String> scrum1 = new LinkedHashMap<>();
        scrum1.put("ali", "dev");
        scrum1.put("halil", "sdet");
        scrum1.put("ceyda", "scrumMaster");
        scrum1.put("muhtar", "po");

        Map<String, String> scrum2 = new LinkedHashMap<>();
        scrum2.put("alexandra", "dev");
        scrum2.put("yasin", "sdet");
        scrum2.put("karen", "scrumMaster");
        scrum2.put("oscar", "po");

        Map<String, String> scrum3 = new LinkedHashMap<>();
        scrum3.put("hilal", "dev");
        scrum3.put("olya", "sdet");
        scrum3.put("emin", "scrumMaster");
        scrum3.put("alya", "po");

        Map<String, String> scrum4 = new LinkedHashMap<>();
        scrum4.put("arya", "dev");
        scrum4.put("handan", "sdet");
        scrum4.put("george", "scrumMaster");
        scrum4.put("halide", "po");

        Map<String, String> scrum5 = new LinkedHashMap<>();
        scrum5.put("karen", "dev");
        scrum5.put("kenan", "sdet");
        scrum5.put("kamile", "scrumMaster");
        scrum5.put("yasir", "po");

        List<Map<String, String>> srumTeams = new ArrayList<>();


        srumTeams.add(scrum1);
        srumTeams.add(scrum2);
        srumTeams.add(scrum3);
        srumTeams.addAll(Arrays.asList(scrum4, scrum5));
        System.out.println(srumTeams);
        System.out.println("srumTeams.size() = " + srumTeams.size());


        System.out.println("----------------");

        for (Map<String, String> each : srumTeams) {
            for (Map.Entry<String, String> eachEntry : each.entrySet()) {
                System.out.println("eachEntry.getValue() = " + eachEntry.getValue());
                System.out.println("eachEntry.getKey() = " + eachEntry.getKey());
                System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
            }
        }
        System.out.println("----------------------");

        for (Map<String, String> each : srumTeams) {
            for (Map.Entry<String, String> eachEntry : each.entrySet()) {
                if (eachEntry.getValue().equals("scrumMaster")){
                    System.out.println(eachEntry.getKey());
                }

            }

        }
    }
}
