package day08İf;

public class GradeReport {

    public static void main(String[] args) {

       int score=55;
       boolean a=score>=90&&score<=100;
       boolean b=score>=80&&score<=89;
       boolean c=score>=70&&!a&&!b;
       boolean d=score>=60&&score<=69;
       boolean e=score>=0&&!a&&!b&&!c&&!d;




       if(a){
           System.out.println(score+" is excellent");
       }
       if(b){
           System.out.println(score+" is great");
       }
       if(c){
           System.out.println(score+" is good");
       }
       if(d){
           System.out.println(score+" is passed");
       }
       if(e){
           System.out.println(score+" is failed");
       }




        /*

        90~100 -> excellent
        80~89 -> great
        70~79 -> good
        60~69 ->passed
        0~59 -> failed
         */


    }

}
