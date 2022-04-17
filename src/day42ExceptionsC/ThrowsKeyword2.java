package day42ExceptionsC;

public class ThrowsKeyword2 {

    public static void main(String[] args) /*throws RuntimeException*/{



        System.out.println("test started");

       try {
           System.out.println(8/0);//it is only performed by try &catch because it is unchecked exception
       }catch (Exception e){
           e.printStackTrace();
       }

        System.out.println("test completed");
    }

}
