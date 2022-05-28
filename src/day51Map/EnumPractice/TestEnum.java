package day51Map.EnumPractice;

public class TestEnum {
    public static void main(String[] args) {

        String browser="wooden spoon";
        //Browser browser1="wooden spoon";
        Browser browser1=Browser.CHROME;

        Season season=Season.SPRİNG;

        switch (browser1){
            case EDGE:
                System.out.println("edge is selected");
                break;

            case OPERA:
                System.out.println("opera is selected");
                break;

            case CHROME:
                System.out.println("chrome is selected");
                break;

            case FİREFOX:
                System.out.println("firefox is selected");
                break;

            default:
                System.out.println("safari is selected");
                break;
        }


    }


}
