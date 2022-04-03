package day21Array;

public class Merge {
    public static void main(String[] args) {
        String[]items={"SHOES","airphone","jackets"};
        double[] prices={99.99,67.87,12.34};
        int[] itemId={1234,45678,8765};
        //items-ıtemıd-prices

        for (int i = 0; i < items.length; i++) {

            String item=items[i];
            double price=prices[i];
            int ıd=itemId[i];

            System.out.println(item+" "+ıd+" "+price);

        }


    }


}
