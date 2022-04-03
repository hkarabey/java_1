package day28ArrayList;

import java.util.ArrayList;

public class ArraylistMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("----------add---------");
        //add
        numbers.add(10);//
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(50);
        numbers.add(3, 6);//önce bu ekleniyor
        numbers.add(3, 35);//sonra 3 e bu ekleniyor

        System.out.println(numbers);
        System.out.println("----------size----------");
//size
        System.out.println(numbers.size());
        int lastIndex = numbers.size() - 1;
        System.out.println("last index=" + lastIndex);
        System.out.println("----------get----------");
//get
        Integer num = numbers.get(1);
        System.out.println(num);
        System.out.println("----------get-------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));



        }
        System.out.println("------------set--------");
        //set
        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("ruby");

        System.out.println(list);

        list.set(2,"javascript");
        list.set(3,"c++");
        System.out.println(list);

        System.out.println("------remove---------");
        ArrayList<String> employees=new ArrayList<>();

        employees.add("suat");
        employees.add("jesica");
        employees.add("olga");
        employees.add("maria");
        employees.add("hulya");
        employees.add("halil");
        employees.add("kalovan");
        System.out.println(employees);
        employees.remove(3);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove("kalovan");
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);
    }


}
