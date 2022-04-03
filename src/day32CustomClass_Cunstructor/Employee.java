package day32CustomClass_Cunstructor;

public class Employee {

  public String name;
  public char gender;
  public String jobTıtle;
  public double salary;


  public Employee(String name){
      this.name=name;
  }

  public Employee(String name,char gender){
    this(name);
    //Employee(name);
    //this.name=name;
    this.gender=gender;
  }
  public Employee(String name,char gender,String jobTıtle){
    this.name=name;
    this.gender=gender;
    this.jobTıtle=jobTıtle;
  }
  public Employee(String name,char gender,String jobTıtle,double salary){
   // this.name=name;
    // this.gender=gender;
    //this.jobTıtle=jobTıtle;
    this(name,gender,jobTıtle);
    this.salary=salary;
  }


  /*public void method1(){
    System.out.println("method");
  }
  public void method2(){
    method1();
  }
  We do not like this with constructor because it is regular and special method
  */



  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", gender=" + gender +
            ", jobTıtle='" + jobTıtle + '\'' +
            ", salary=" + salary +
            '}';
  }
}
