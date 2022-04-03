package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll(Arrays.asList(100,92,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer>gradeOfA=new ArrayList<>();//90-100
        gradeOfA.addAll(scores);
        gradeOfA.removeIf(p->p<90);
        System.out.println("grade of A is: "+gradeOfA);


        ArrayList<Integer>gradeOfB=new ArrayList<>(scores);//80-90
        gradeOfB.removeIf(p-> p>90||p<80);
        System.out.println("grade of B is: "+gradeOfB);

        ArrayList<Integer>gradeOfC=new ArrayList<>(scores);//70-80
       gradeOfC.removeIf(p-> p>80||p<70);
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer>gradeOfD=new ArrayList<>(scores);//60-70
        gradeOfD.removeIf(p-> !(p>60&&p<70));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer>gradeOfF=new ArrayList<>(scores);
        gradeOfF.removeIf(p-> p>60);
        System.out.println("gradeOfF = " + gradeOfF);


    }



}
