import bagel.* ;
import bagel.util.Point ;

/**
 * The MovingEntity is used as a superclass for the shot and player used in the ShadowTreasure game. It creates the
 * blueprint for a moving entity. It includes methods for setting and retrieving entity positions, pointing to and
 * moving towards specific points, and rendering the image used for the entity.
 */
public class MovingEntity {

    /**
     * The FILENAME attribute is used to access the image that needs toi be rendered. It is changed specific to the
     * entity type (Player, Shot) and is set to the correct value in the subclass
     */
    public String FILENAME;

    /**
     * The STEP_SIZE attribute is used for moving entity movement. It determines the distance covered in each tick
     * It is changed specific to the entity type (Player, Shot) and is set to the correct value in the subclass
     */
    public int STEP_SIZE;

    private Point position;
    private Image image ;
    private double directionX, directionY;


    /**
     * This method sets the position of the moving entity.
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

    //

    /**

     * This method recieves a point where we want the entity to move, and sets the entity's moving direction towards it.
     * It also uses the normalizeD() method to normalize the direction and movement.
     *
     * @param dest this is the destination to which you want the entity to move to
     */
    public void pointTo(Point dest) {
        this.directionX = dest.x - this.position.x;
        this.directionY = dest.y - this.position.y;
        normalizeD();
    }

    // normalize direction
    /**
     * Note that the pointTo and normalizeD methods shown below are taken from Project 1 solutions.
     *
     * This method normalizes the direction and distance used to move to the desired point.
     */
    public void normalizeD() {
        double len = Math.sqrt(Math.pow(this.directionX, 2) + Math.pow(this.directionY, 2));
        this.directionX /= len;
        this.directionY /= len;
    }



    /**
     * This method updates the position of the moving entity.
     */
    public void update() {
        this.position = new Point(this.position.x+STEP_SIZE*this.directionX, this.position.y+STEP_SIZE*this.directionY); // This code is taken from Project1 solutions

    }


    /**
     * This method renders the image specified by the filename.
     */
    public void render() {
        this.image = new Image(FILENAME);
        image.drawFromTopLeft(position.x, position.y);

    }

}