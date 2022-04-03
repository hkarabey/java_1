package day29ArrayList_CollectıonClass;

import java.util.ArrayList;

public class CovertDay28 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);

        //unique

       /* for (int i = 0; i < list.size(); i++) {
            int fre=0;
            for (int j = 0; j < list.size(); j++) {


                if (list.get(i) == list.get(j)) {
                    fre++;

                }

            }
            if(fre==1){
                System.out.println(list.get(i) + " is unıque");
            }
        }
*/
        for (Integer each : list) {
            int fre = 0;
            for (Integer element : list) {
                if (element ==each){
                    fre++;
                }

            }
            if(fre==1){
                System.out.println(each+" is unıqeu");
            }
        }
    }

}
