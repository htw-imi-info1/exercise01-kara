import greenfoot.*;

/**
 * This class creates a world for Kara. It contains settings for height and 
 * width of the world and initializes the Actors.
 * 
 * @author Barne Kleinen
 */
public class KaraWorld03 extends World 
{   
    private static final int WORLD_WIDTH = 16;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 5;  // Number of vertical cells

    private static final int CELL_SIZE = 28; // Size of one cell

    /**
     * Creates a world for Kara.
     */
    public KaraWorld03() 
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

        Kara03 kara03 = new Kara03();
        addObject(kara03, 1, 2);
        Tree tree = new Tree();
        addObject(tree, 4, 2);
        Tree tree2 = new Tree();
        addObject(tree2, 6, 2);
        Tree tree3 = new Tree();
        addObject(tree3, 7, 2);
        Tree tree4 = new Tree();
        addObject(tree4, 9, 2);
        Tree tree5 = new Tree();
        addObject(tree5, 10, 2);
        Tree tree6 = new Tree();
        addObject(tree6, 11, 2);
        Tree tree7 = new Tree();
        addObject(tree7, 13, 2);
        Leaf leaf = new Leaf();
        addObject(leaf, 14, 2);
    }
}
