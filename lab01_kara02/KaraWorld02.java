import greenfoot.*;

/**
 * This class creates a world for Kara. It contains settings for height and 
 * width of the world and initializes the Actors.
 * 
 * @author Barne Kleinen
 */
public class KaraWorld02 extends World 
{   
    private static final int WORLD_WIDTH = 16;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 5;  // Number of vertical cells

    private static final int CELL_SIZE = 28; // Size of one cell

    /**
     * Creates a world for Kara.
     */
    public KaraWorld02() 
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

        Kara02 kara02 = new Kara02();
        addObject(kara02, 0, 1);
        kara02.setLocation(0, 2);
        Tree tree = new Tree();
        addObject(tree, 2, 3);
        Tree tree2 = new Tree();
        addObject(tree2, 3, 3);
        Tree tree3 = new Tree();
        addObject(tree3, 4, 3);
        Tree tree4 = new Tree();
        addObject(tree4, 5, 3);
        Tree tree5 = new Tree();
        addObject(tree5, 6, 3);
        Tree tree6 = new Tree();
        addObject(tree6, 7, 3);
        Tree tree7 = new Tree();
        addObject(tree7, 10, 3);
        Tree tree8 = new Tree();
        addObject(tree8, 11, 3);
        Tree tree13 = new Tree();
        addObject(tree13, 3, 1);
        Tree tree14 = new Tree();
        addObject(tree14, 4, 1);
        Tree tree15 = new Tree();
        addObject(tree15, 5, 1);
        Tree tree16 = new Tree();
        addObject(tree16, 6, 1);
        Tree tree17 = new Tree();
        addObject(tree17, 7, 1);
        Tree tree18 = new Tree();
        addObject(tree18, 8, 1);
        Tree tree19 = new Tree();
        addObject(tree19, 11, 1);
        Tree tree20 = new Tree();
        addObject(tree20, 12, 1);
        Tree tree21 = new Tree();
        addObject(tree21, 13, 1);
        removeObject(tree13);
        Tree tree22 = new Tree();
        addObject(tree22, 9, 1);
        Tree tree23 = new Tree();
        addObject(tree23, 10, 1);
        Tree tree24 = new Tree();
        addObject(tree24, 9, 3);
        Tree tree25 = new Tree();
        addObject(tree25, 8, 3);
    }
}
