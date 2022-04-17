package day42ExceptionsC;

class FadyException extends RuntimeException {


    public FadyException() {
        super("time for short break");
    }

    public FadyException(String message) {
        super(message);

    }

}


public class CustomException {
    public static void main(String[] args) {

        throw new FadyException("it is time for break");
    }


}
