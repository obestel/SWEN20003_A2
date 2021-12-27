//import bagel.* ;

/**
 * The Zombie class is a subclass of StationaryEntity and is used to add the filename where zombie.png can be found
 * and contains a constructor to intitialise a zombie. It also contains a variable for when a zombie has been shot at.
 */


public class Zombie extends StationaryEntity {
    private boolean fired_at = false ;

    /**
     * This is a constructor that intialises a zombie by specifying the location of zombie.png
     */
    public Zombie() {
        FILENAME = "res/images/zombie.png";
    }


    /**
     * This is a constructor that intialises a zombie at a given position and by specifying the location of of
     * zombie.png
     *
     * @param x sets the horizontal position of the zombie
     * @param y sets the vertical position of the zombie
     */
    public Zombie(double x, double y){
        set_position(x, y);
        FILENAME = "res/images/zombie.png";

    }

    /**
     * This method sets the fired_at boolean variable to be true so we know a zombie has a shot traveling towards it
     */
    public void shoot_at(){
        fired_at = true ;
    }

    /**
     * This method returns the fired_at boolean variable
     *
     * @return boolean returns whether a shot is traveling towards the zombie
     */
    public boolean get_fired_at(){
        return this.fired_at ;
    }
}

