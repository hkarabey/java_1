package day06Casting;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class PrimitiveCastings {
    public static void main(String[] args) {

    byte a=100;
    short b=a;

    //compiler done it outomaticly

    byte c=50;
    short d=(short)c;

    //aoutomaticly yaopmayacaksak böyle yapıyoruz

    int e=2390;
    long g=e;

    long h=c;
    float ı=g;
    double j=ı;
    //expilicit için kenidmiz yapıyoruz
     int x=130;
     short y=(short)x;
     byte z=(byte)y;
        System.out.println(x+":"+z);

        double l=2.5;
        float m=(float)l;

        System.out.println(l+"="+m);

        double n=18.8;
        int o=(int)n;

        System.out.println(n+" = "+o);

double a1=12.2;
short a2= (short) a1;

float b1=12.21f;
long c1= (long) b1;


}
}
