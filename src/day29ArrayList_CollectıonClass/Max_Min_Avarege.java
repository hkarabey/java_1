package day29ArrayList_CollectıonClass;

import java.util.ArrayList;

public class Max_Min_Avarege {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

int max=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max){
                max=list.get(i);
            }

        }
        System.out.println(max);

        int min=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min>list.get(i)){
                min=list.get(i);
            }
        }
        System.out.println(min);

        double sum=0;

        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }

        double average=sum/list.size();
        System.out.println(average);
    }



}
