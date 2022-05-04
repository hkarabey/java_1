package day45Interface.shape;

public interface Volume {

    /*public final static*/ boolean hasVolume = true;

    double volume();

    default void drink() {
        System.out.println("all animal drink water");// default means specifier and like instance all aniimal drink water
    }
}
