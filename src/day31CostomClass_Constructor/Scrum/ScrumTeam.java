package day31CostomClass_Constructor.Scrum;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO,BA,SM;
    public ArrayList<Tester>testersList=new ArrayList<>();
    public ArrayList<Developer>devsTeam=new ArrayList<>();

    int dayOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[]testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDev(Developer developer){
        devsTeam.add(developer);
    }

    public void addDevs(Developer[]developers) {
        devsTeam.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeId){
        testersList.removeIf(p->p.ıdOfEmployee==employeeId);
    }

    public void removedevs(int employeeId){
        devsTeam.removeIf(p->p.ıdOfEmployee==employeeId);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of devs=" + devsTeam.size() +
                ", dayOfSprint=" + dayOfSprint +
                '}';
    }
}
