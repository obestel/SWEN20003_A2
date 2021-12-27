
/**
 * The Treasure class is a subclass of StationaryEntity and is used to add the filename where treasure.png can be found
 * and contains a constructor to intitialise the treasure
 */

public class Treasure extends StationaryEntity{

    /**
     * This is a constructor that intialises the treasure by specifying the location of zombie.png
     */
    public Treasure() {
        FILENAME = "res/images/treasure.png";
    }

}
