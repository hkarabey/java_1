package day40FinalKeyWord;

import day39.Area.Circle;
import day39.Area.Square;

public class EncapsulatıonReview {

    private Circle circle;

    private Square square;

    public Circle getCircle(){
    return circle;
    }
    public void setCircle(){
        if (circle.getRadıus()<5){
            return;
        }
        this.circle=circle;
    }


}
