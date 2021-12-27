import bagel.* ;
import bagel.util.Point ;
/**
 * The StationaryEntity is used as a superclass for the zombies, sandwiches and treasure used in the ShadowTreasure game. It creates the
 * blueprint for a stationary entity. It includes methods for setting and retrieving entity positions, establishing
 * whether a stationary entity has been interacted with, and rendering the image for the entity in the display window
 */
public class StationaryEntity {

    /**
     * The FILENAME attribute is used to access the image that needs toi be rendered. It is changed specific to the
     * entity type (Player, Shot) and is set to the correct value in the subclass
     */
    public String FILENAME;
    private Point position;
    private Image image ;
    private boolean interacted_with = false ;


    /**
     * This method sets the position of the stationary entity.
     *
     * @param x this sets the entity's horizontal position
     * @param y this sets the entity's vertical position
     */
    public void set_position(double x, double y) {
        this.position = new Point(x, y);

    }

    /**
     * This method returns the position of the moving entity.
     *
     * @return Point position . This is the current position of the moving entity
     */
    public Point get_position() {
        return this.position;

    }

    /**
     * This method sets whether the entity has been interacted with.
     */

    public void set_interacted_with(){
        this.interacted_with = true ;
    }

    /**
     * This method gets whether the entity has been interacted with.
     *
     * @return boolean returns whether the entity has been interacted with
     */
    public boolean get_interacted_with(){
        return interacted_with ;
    }


    /**
     * This method renders the stationary entity in the desired location in the display window
     * based on the image found at FILENAME
     */
    public void render() {
        this.image = new Image(FILENAME);
        image.drawFromTopLeft(position.x, position.y);



    }

}

