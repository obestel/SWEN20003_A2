/**
 * The Shot class is a subclass of moving entity and is used to add filename where the shot.png can be found and step
 * size dictated by the assignment to the bullet/shot entity.
 */

public class Shot extends MovingEntity {

    /**
     * This is the constructor method for a Shot. It initialises the filename where the shot.png can be found, and sets
     * the step size to 25.
     */
    public Shot(){
        FILENAME = "res/images/shot.png" ;
        STEP_SIZE = 25 ;
    }

}
