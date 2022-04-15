package day41Exeptions;

import day39.CydeoTask.Employee;

public class MultıCatchBlocks {
    public static void main(String[] args) {

        Employee employee=null;

        try {


            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("second catch");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("third catch");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("forth catch");
            e.printStackTrace();
        }



    }



}
