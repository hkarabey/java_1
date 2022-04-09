package day37Inheritance.Scrum;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        String company="Amazon Inc";
        ProductOwner po=new ProductOwner("shuaib",32,'m',"po",1,120000,company);
        BusinessAnalist ba=new BusinessAnalist("sharon",33,'f',"ba",2,125000,company);
        ScrumMaster sm=new ScrumMaster("alexandra",33,'f',"sm",3,125000,company);

        Tester tester1=new Tester("halil",33,'m',"sdet",4,125000,company);
        Tester tester2=new Tester("aotron",33,'m',"sdet",5,125000,company);
        Tester tester3=new Tester("jimmy",33,'m',"sdet",6,125000,company);
        Tester tester4=new Tester("neriman",33,'f',"sdet",7,125000,company);

        Tester[]testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("halil",33,'m',"sdet",4,125000,company);
        Developer developer2=new Developer("aotron",33,'m',"sdet",5,125000,company);
        Developer developer3=new Developer("jimmy",33,'m',"sdet",6,125000,company);
        Developer developer4=new Developer("neriman",33,'f',"sdet",7,125000,company);

        ScrumTeam scrumTeam=new ScrumTeam(sm,po,ba);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);
        System.out.println("--------------");
        for (Tester tester : testers) {

            System.out.println(tester);
        }
    }



}
