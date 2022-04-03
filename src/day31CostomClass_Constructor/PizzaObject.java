package day31CostomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObject {
    public static void main(String[] args) {

        ArrayList<Pizza>pizzas=new ArrayList<>();


        Pizza pizza1 = new Pizza('s', 2, 1);
pizzas.add(pizza1);

        System.out.println("pizza1 = " + pizza1);
        System.out.println("pizza1.calculateCost() = " + pizza1.calculateCost());

      for (int i=0;i<100;i++){
          Pizza small=new Pizza('s',2,3);
          Pizza medium=new Pizza('m',3,4);
          Pizza large=new Pizza('l',4,5);
      pizzas.addAll(Arrays.asList(small,large,medium));
      }

        System.out.println("total number of pizza "+pizzas.size());

      double totalPrize=0;
        for (Pizza each : pizzas) {
            totalPrize+=each.calculateCost();

        }
        System.out.println(totalPrize);
    }
}
