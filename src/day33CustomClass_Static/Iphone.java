package day33CustomClass_Static;

public class Iphone {

    public static String brand="Apple";

    public String model;
    public double price;

    public static String operatingSystem="IOS";

    public String color;
    public String size;

    public static String madeIn="china";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasCamera=true;
    public static boolean hasFaceTime=true;


    public void printModel(){//static is not accessible
        System.out.println(model+" : "+price);

       // System.out.println(operatingSystem);
    }
    public static void printOperatıngSystem(){

        System.out.println(operatingSystem);
    }




}
