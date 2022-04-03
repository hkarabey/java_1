package day32CustomClass_Cunstructor;

public class Carpet {
    public double width,length,unitPrice;
    public boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcualte(){
       double totalPrice=0;
        if (isPersian){
            totalPrice+=(width*length)*unitPrice+200;
        }else {
            totalPrice+=(width*length)*unitPrice;
        }

        return totalPrice;

    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ",totalPrice="+calcualte()+
                '}';
    }
}
