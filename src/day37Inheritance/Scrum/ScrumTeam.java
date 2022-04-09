package day37Inheritance.Scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

public ScrumMaster sm;
public ProductOwner po;
public BusinessAnalist ba;

ArrayList<Tester>testers=new ArrayList<>();
ArrayList<Developer>developers=new ArrayList<>();

    public ScrumTeam(ScrumMaster sm, ProductOwner po, BusinessAnalist ba) {
        this.sm = sm;
        this.po = po;
        this.ba = ba;
    }
    public void addTester( Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[]testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p->p.ID==id);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[]developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p->p.ID==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "po=" + po.name +
                ", ba=" + ba.name +
                ", sm=" + sm.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
