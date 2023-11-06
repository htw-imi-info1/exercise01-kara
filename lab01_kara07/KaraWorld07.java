import greenfoot.*;
import java.util.Random;

/**
 * This class creates a world for Kara. It contains settings for height and 
 * width of the world and initializes the Actors.
 * 
 * @author Barne Kleinen
 */
public class KaraWorld07 extends World 
{   
    private static final int WORLD_WIDTH = 12;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 6;  // Number of vertical cells

    private static final int CELL_SIZE = 28; // Size of one cell
    
    private static final int STELLEN = 8, ROW_OFFSET = 2, COLUMN_OFFSET = 2;
    
    private static final Random randomGenerator = new Random();
  
    /**
     * Creates a world for Kara.
     */
    public KaraWorld07() 
    {
        // Create the new world
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);

        setPaintOrder(Kara.class, Tree.class, Mushroom.class, Leaf.class);
        Greenfoot.setSpeed(40);

        // Initialize actors
       prepare();
    }

    /**
     * Prepare the world, i.e. create all initial actors.
     * 
     * Hint:
     * First create and position all Actors with the mouse in the world.
     * Then right-click on the world and choose 'Save the World'. This will
     * automatically generate the content of this method.
     */
    private void prepare() 
    {
        int upper = randomGenerator.nextInt(255);
        int lower = randomGenerator.nextInt(255);
        int result = upper + lower;
        //System.out.println("upper: "+upper+ " lower: "+lower);
        //System.out.println(Integer.toBinaryString(upper)+ " "+Integer.toBinaryString(lower));

        for (int stelle = 0; stelle<STELLEN; stelle++){
            if ((upper & (1 << stelle)) != 0){
                Leaf leaf = new Leaf();
                addObject(leaf,(STELLEN-stelle+COLUMN_OFFSET-1),ROW_OFFSET);
            }
            if ((lower & (1 << stelle)) != 0){
                Leaf leaf = new Leaf();
                addObject(leaf,(STELLEN-stelle+COLUMN_OFFSET-1),ROW_OFFSET+1);
            }

        }

        Kara07 kara = new Kara07(result);
        addObject(kara, 10, 4);
        kara.turnLeft();
        kara.turnLeft();

        Mushroom mushroom = new Mushroom();
        addObject(mushroom, 10, 1);
        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2, 1, 1);

        Mushroom mushroom3 = new Mushroom();
        addObject(mushroom3, 11, 4);
    }
}
