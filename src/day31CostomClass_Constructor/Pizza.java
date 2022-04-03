package day31CostomClass_Constructor;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPeperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPeperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPeperoniTopping = numberOfPeperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping +
                ",totalPrize=$"+calculateCost()+
                '}';
    }

public double calculateCost(){
        double startingCost=(size=='s')?10:(size=='m')?12:14;
        double totalPrize=startingCost+(numberOfCheeseTopping+numberOfPeperoniTopping)*2;
        return totalPrize;
}

}
