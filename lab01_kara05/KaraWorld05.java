import greenfoot.*;

/**
 * This class creates a world for Kara. It contains settings for height and 
 * width of the world and initializes the Actors.
 * 
 * @author Barne Kleinen
 */
public class KaraWorld05 extends World 
{   
    private static final int WORLD_WIDTH = 9;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 9;  // Number of vertical cells

    private static final int CELL_SIZE = 28; // Size of one cell

    /**
     * Creates a world for Kara.
     */
    public KaraWorld05() 
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

        Kara05 kara05 = new Kara05();
        addObject(kara05, 1, 1);
        Tree tree = new Tree();
        addObject(tree, 0, 0);
        Tree tree2 = new Tree();
        addObject(tree2, 1, 0);
        Tree tree3 = new Tree();
        addObject(tree3, 2, 0);
        Tree tree4 = new Tree();
        addObject(tree4, 3, 0);
        Tree tree5 = new Tree();
        addObject(tree5, 4, 0);
        Tree tree6 = new Tree();
        addObject(tree6, 5, 0);
        Tree tree7 = new Tree();
        addObject(tree7, 6, 0);
        Tree tree8 = new Tree();
        addObject(tree8, 7, 0);
        Tree tree9 = new Tree();
        addObject(tree9, 8, 0);
        Tree tree10 = new Tree();
        addObject(tree10, 8, 1);
        Tree tree11 = new Tree();
        addObject(tree11, 8, 2);
        Tree tree12 = new Tree();
        addObject(tree12, 8, 3);
        Tree tree13 = new Tree();
        addObject(tree13, 8, 4);
        Tree tree14 = new Tree();
        addObject(tree14, 8, 5);
        Tree tree15 = new Tree();
        addObject(tree15, 8, 6);
        Tree tree16 = new Tree();
        addObject(tree16, 8, 7);
        Tree tree17 = new Tree();
        addObject(tree17, 8, 8);
        Tree tree18 = new Tree();
        addObject(tree18, 7, 8);
        Tree tree19 = new Tree();
        addObject(tree19, 6, 8);
        Tree tree20 = new Tree();
        addObject(tree20, 5, 8);
        Tree tree21 = new Tree();
        addObject(tree21, 4, 8);
        Tree tree22 = new Tree();
        addObject(tree22, 3, 8);
        Tree tree23 = new Tree();
        addObject(tree23, 2, 8);
        Tree tree24 = new Tree();
        addObject(tree24, 1, 8);
        Tree tree25 = new Tree();
        addObject(tree25, 0, 8);
        Tree tree26 = new Tree();
        addObject(tree26, 0, 7);
        Tree tree27 = new Tree();
        addObject(tree27, 0, 6);
        Tree tree28 = new Tree();
        addObject(tree28, 0, 5);
        Tree tree29 = new Tree();
        addObject(tree29, 0, 4);
        Tree tree30 = new Tree();
        addObject(tree30, 0, 3);
        Tree tree31 = new Tree();
        addObject(tree31, 0, 2);
        Tree tree32 = new Tree();
        addObject(tree32, 0, 1);
        Leaf leaf = new Leaf();
        addObject(leaf, 1, 1);
        Leaf leaf2 = new Leaf();
        addObject(leaf2, 2, 1);
        Leaf leaf3 = new Leaf();
        addObject(leaf3, 2, 2);
        Leaf leaf4 = new Leaf();
        addObject(leaf4, 1, 2);
        Leaf leaf5 = new Leaf();
        addObject(leaf5, 3, 2);
        Leaf leaf6 = new Leaf();
        addObject(leaf6, 3, 3);
        Leaf leaf7 = new Leaf();
        addObject(leaf7, 2, 3);
        Leaf leaf8 = new Leaf();
        addObject(leaf8, 4, 3);
        Leaf leaf9 = new Leaf();
        addObject(leaf9, 5, 3);
        Leaf leaf10 = new Leaf();
        addObject(leaf10, 7, 1);
        Leaf leaf11 = new Leaf();
        addObject(leaf11, 6, 1);
        Leaf leaf12 = new Leaf();
        addObject(leaf12, 5, 2);
        Leaf leaf13 = new Leaf();
        addObject(leaf13, 6, 2);
        Leaf leaf14 = new Leaf();
        addObject(leaf14, 7, 2);
        Leaf leaf15 = new Leaf();
        addObject(leaf15, 6, 3);
        Leaf leaf16 = new Leaf();
        addObject(leaf16, 5, 4);
        Leaf leaf17 = new Leaf();
        addObject(leaf17, 3, 4);
        Leaf leaf18 = new Leaf();
        addObject(leaf18, 4, 4);
        Leaf leaf19 = new Leaf();
        addObject(leaf19, 2, 5);
        Leaf leaf20 = new Leaf();
        addObject(leaf20, 3, 5);
        Leaf leaf21 = new Leaf();
        addObject(leaf21, 4, 5);
        Leaf leaf22 = new Leaf();
        addObject(leaf22, 5, 5);
        Leaf leaf23 = new Leaf();
        addObject(leaf23, 6, 5);
        Leaf leaf24 = new Leaf();
        addObject(leaf24, 7, 6);
        Leaf leaf25 = new Leaf();
        addObject(leaf25, 6, 6);
        Leaf leaf26 = new Leaf();
        addObject(leaf26, 8, 7);
        Leaf leaf27 = new Leaf();
        addObject(leaf27, 6, 7);
        Leaf leaf28 = new Leaf();
        addObject(leaf28, 7, 7);
        Leaf leaf29 = new Leaf();
        addObject(leaf29, 5, 6);
        Leaf leaf30 = new Leaf();
        addObject(leaf30, 2, 7);
        Leaf leaf31 = new Leaf();
        addObject(leaf31, 1, 7);
        Leaf leaf32 = new Leaf();
        addObject(leaf32, 1, 6);
        Leaf leaf33 = new Leaf();
        addObject(leaf33, 2, 6);
        Leaf leaf34 = new Leaf();
        addObject(leaf34, 3, 6);
    }
}
