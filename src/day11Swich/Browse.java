package day11Swich;

public class Browse {
    public static void main(String[] args) {
       String browser="chrome";
       String result="";
       boolean validBrowser=browser=="chrome"||browser=="safari"||browser=="edge"||browser=="firefox"||browser=="opera";

       if (validBrowser){
       if (browser=="chrome"){
           result="your browser is chrome";
       }
       else if (browser=="safari"){
           result="your browser is safari";
       }else if (browser=="edge"){
           result="your browser is edge";
       }else if (browser=="firefox"){
           result="your browser is firefox";
       }else {
           result="your browser is opera";
       }
       }else {
           result="invalid browser";
       }
        System.out.println(result);



       }



    }




