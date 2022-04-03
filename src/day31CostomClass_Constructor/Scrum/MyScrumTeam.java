package day31CostomClass_Constructor.Scrum;

import java.util.ArrayList;

public class MyScrumTeam {
    public static void main(String[] args) {

        // ArrayList<Tester>testers=new ArrayList<>();
        // ArrayList<Developer>developers=new ArrayList<>();

        Tester tester1=new Tester("halil",11,"sdet",100);
        Tester tester2=new Tester("sima",12,"sdet",95);
        Tester tester3=new Tester("handan",13,"sdet",87);
        Tester tester4=new Tester("ali",14,"sdet",106);

        Developer developer1=new Developer("olga",21,"java dev",125);
        Developer developer2=new Developer("alaksandra",22,"java dev",132);
        Developer developer3=new Developer("kevin",23,"java dev",134);
        Developer developer4=new Developer("tunc",24,"java dev",102);
        Developer developer5=new Developer("sinem",25,"senior dev",165);

        ScrumTeam scrum=new ScrumTeam("nigara","hüseyin","neira",14);

        scrum.addTester(tester1);
        scrum.addDev(developer1);

        System.out.println(scrum);
        System.out.println("-------------");

        Tester[]testera={tester2,tester3,tester4};
        Developer[]devarr={developer2,developer3,developer4,developer5};

        scrum.addDevs(devarr);
        scrum.addTesters(testera);
        System.out.println(scrum);
        System.out.println("-------------");

        for (Tester eachtester: scrum.testersList){
            System.out.println(eachtester.name+" salary's is "+eachtester.salary);
        }
        System.out.println("----------");

        for ( Developer eachDev: scrum.devsTeam){
            System.out.println(eachDev.name+" salary's is "+eachDev.salary);
        }
        System.out.println("----------");

        scrum.removeTester(13);
        System.out.println(scrum);

        scrum.removedevs(21);
        System.out.println(scrum);

    }

}
