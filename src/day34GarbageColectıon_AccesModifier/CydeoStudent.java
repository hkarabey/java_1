package day34GarbageColectıon_AccesModifier;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName=studentName;
       // schoolName="cydeo";
    }

    static {
        schoolName="cydeo";
    }


}

class CydeoStudentObject{

    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("jimmy");
        CydeoStudent student2=new CydeoStudent("katy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.studentName);
        System.out.println(student2.studentName);


    }
}