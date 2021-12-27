import bagel.* ;
import bagel.Font;
import bagel.util.Colour;


/**
 * The Player class is a subclass of MovingEntity and is used to add filename where the player.png can be found and step
 * size dictated by the assignment for the player. It also adds an energy attribute to the player, which changes
 * depending on whether the player interacts with a sandwich or a zombie
 */
public class Player extends MovingEntity {

    
    private int energy ;
    private final Font font = new Font("res/font/DejaVuSans-Bold.ttf", 20) ;
    private final DrawOptions dop = new DrawOptions() ;

    /**
     * The constructor for the Player class, that sets the filename and step size according to assignment specification
     */

    public Player(){
        FILENAME = "res/images/player.png" ;
        STEP_SIZE = 10 ;
    }

    /**
     * set_energy sets the energy level of the player.
     *
     * @param energy this is the energy which the player has after the set_energy method is called
     */
    public void set_energy(int energy) {
        this.energy = energy ;
    }


    /**
     * get_energy returns the energy level of the player.
     *
     * @return int this returns the player's energy
     */
    public int get_energy(){
        return this.energy;
    }


    /**
     * render_energy renders the energy in black font in the bottom left of the display window using the desired font
     * and colour.
     */
    public void render_energy(){
         font.drawString("energy: "+ energy,20,760, dop.setBlendColour(Colour.BLACK));
     }

    /**
     * eat_sandwich method adds 5 energy to the players energy level.
     */
    public void eatSandwich(){
        energy += 5;
    }

    /**
     * reachZombie method removes 3 energy from the players energy level.
     */
    public void reachZombie(){
        energy -= 3;
    }

}
