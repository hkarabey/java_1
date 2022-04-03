package day23CustomMethodIntro;

import java.util.Arrays;
import java.util.Scanner;

public class Replit2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[]strArr=str.split(", ");
        int min=strArr[0].length();
        for(int i=0;i<strArr.length;i++){
            if(min>strArr[i].length()){
                min=strArr[i].length();
            }
        }
        int num=0;

        for(int i=0;i<strArr.length;i++){
            if(strArr[i].length()==min){
                num++;
            }
        }
        String[] output=new String[num];

        for(int i=0,j=0;i<strArr.length;i++,j++){
            if(strArr[i].length()==min){
                output[j]=strArr[i];
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
