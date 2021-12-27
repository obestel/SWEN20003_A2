
/**
 * The Sandwich class is a subclass of StationaryEntity and is used to add the filename where sandwich.png can be found
 * and contains a constructor to intitialise a sandwich
 */
public class Sandwich extends StationaryEntity {

    /**
     * This is a constructor that intialises a sandwich by specifying the location of sandwich.png
     */
    public Sandwich() {
        FILENAME = "res/images/sandwich.png";
    }

    /**
     * This is a constructor that intialises a sandwich at a given position and by specifying the location of of
     * sandwich.png
     *
     * @param x sets the horizontal position of the sandwich
     * @param y sets the vertical position of the sandwich
     */
    public Sandwich(double x, double  y){
        FILENAME = "res/images/sandwich.png";
        set_position(x,y);
    }

}
