import greenfoot.*;

/**
 * This class creates a world for Kara. It contains settings for height and 
 * width of the world and initializes the Actors.
 * 
 * @author Barne Kleinen
 */
public class KaraWorld04 extends World 
{   
    private static final int WORLD_WIDTH = 11;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 11;  // Number of vertical cells

    private static final int CELL_SIZE = 28; // Size of one cell

    /**
     * Creates a world for Kara.
     */
    public KaraWorld04() 
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

        Kara04 kara04 = new Kara04();
        addObject(kara04, 3, 1);
        Tree tree8 = new Tree();
        addObject(tree8, 1, 0);
        Tree tree9 = new Tree();
        addObject(tree9, 0, 0);
        Tree tree10 = new Tree();
        addObject(tree10, 2, 0);
        Tree tree11 = new Tree();
        addObject(tree11, 3, 0);
        Tree tree12 = new Tree();
        addObject(tree12, 4, 0);
        Tree tree13 = new Tree();
        addObject(tree13, 5, 0);
        Tree tree14 = new Tree();
        addObject(tree14, 6, 0);
        Tree tree15 = new Tree();
        addObject(tree15, 7, 0);
        Tree tree16 = new Tree();
        addObject(tree16, 8, 0);
        Tree tree17 = new Tree();
        addObject(tree17, 9, 0);
        Tree tree18 = new Tree();
        addObject(tree18, 10, 0);
        Tree tree19 = new Tree();
        addObject(tree19, 0, 1);
        Tree tree20 = new Tree();
        addObject(tree20, 1, 1);
        Tree tree21 = new Tree();
        addObject(tree21, 0, 2);
        Tree tree22 = new Tree();
        addObject(tree22, 1, 2);
        Tree tree23 = new Tree();
        addObject(tree23, 1, 3);
        Tree tree24 = new Tree();
        addObject(tree24, 0, 3);
        Tree tree25 = new Tree();
        addObject(tree25, 0, 4);
        Tree tree26 = new Tree();
        addObject(tree26, 1, 4);
        Tree tree27 = new Tree();
        addObject(tree27, 1, 5);
        Tree tree28 = new Tree();
        addObject(tree28, 1, 5);
        Tree tree29 = new Tree();
        addObject(tree29, 0, 5);
        Tree tree30 = new Tree();
        addObject(tree30, 0, 6);
        Tree tree31 = new Tree();
        addObject(tree31, 1, 6);
        Tree tree32 = new Tree();
        addObject(tree32, 1, 7);
        Tree tree33 = new Tree();
        addObject(tree33, 0, 7);
        Tree tree34 = new Tree();
        addObject(tree34, 0, 7);
        Tree tree35 = new Tree();
        addObject(tree35, 0, 8);
        Tree tree36 = new Tree();
        addObject(tree36, 1, 8);
        Tree tree37 = new Tree();
        addObject(tree37, 1, 9);
        Tree tree38 = new Tree();
        addObject(tree38, 0, 9);
        Tree tree39 = new Tree();
        addObject(tree39, 0, 10);
        Tree tree40 = new Tree();
        addObject(tree40, 1, 10);
        Tree tree41 = new Tree();
        addObject(tree41, 2, 10);
        Tree tree42 = new Tree();
        addObject(tree42, 3, 10);
        Tree tree43 = new Tree();
        addObject(tree43, 4, 10);
        Tree tree44 = new Tree();
        addObject(tree44, 5, 10);
        Tree tree45 = new Tree();
        addObject(tree45, 6, 10);
        Tree tree46 = new Tree();
        addObject(tree46, 7, 10);
        Tree tree47 = new Tree();
        addObject(tree47, 8, 10);
        Tree tree48 = new Tree();
        addObject(tree48, 9, 10);
        Tree tree49 = new Tree();
        addObject(tree49, 10, 10);
        Tree tree50 = new Tree();
        addObject(tree50, 10, 8);
        Tree tree51 = new Tree();
        addObject(tree51, 10, 9);
        Tree tree52 = new Tree();
        addObject(tree52, 10, 7);
        Tree tree53 = new Tree();
        addObject(tree53, 10, 6);
        Tree tree54 = new Tree();
        addObject(tree54, 10, 5);
        Tree tree55 = new Tree();
        addObject(tree55, 10, 4);
        Tree tree56 = new Tree();
        addObject(tree56, 10, 3);
        Tree tree57 = new Tree();
        addObject(tree57, 10, 2);
        Tree tree58 = new Tree();
        addObject(tree58, 10, 1);
        Tree tree59 = new Tree();
        addObject(tree59, 3, 2);
        Tree tree60 = new Tree();
        addObject(tree60, 4, 2);
        Tree tree61 = new Tree();
        addObject(tree61, 5, 2);
        Tree tree62 = new Tree();
        addObject(tree62, 6, 2);
        Tree tree63 = new Tree();
        addObject(tree63, 9, 2);
        Tree tree64 = new Tree();
        addObject(tree64, 9, 1);
        Tree tree65 = new Tree();
        addObject(tree65, 9, 3);
        Tree tree66 = new Tree();
        addObject(tree66, 9, 4);
        Tree tree67 = new Tree();
        addObject(tree67, 9, 5);
        Tree tree68 = new Tree();
        addObject(tree68, 9, 6);
        Tree tree69 = new Tree();
        addObject(tree69, 9, 7);
        Tree tree70 = new Tree();
        addObject(tree70, 9, 8);
        Tree tree71 = new Tree();
        addObject(tree71, 9, 9);
        Tree tree72 = new Tree();
        addObject(tree72, 8, 5);
        Tree tree73 = new Tree();
        addObject(tree73, 7, 2);
        Tree tree74 = new Tree();
        addObject(tree74, 5, 3);
        Tree tree75 = new Tree();
        addObject(tree75, 4, 3);
        Tree tree76 = new Tree();
        addObject(tree76, 3, 3);
        Tree tree77 = new Tree();
        addObject(tree77, 6, 3);
        Tree tree78 = new Tree();
        addObject(tree78, 7, 3);
        Tree tree79 = new Tree();
        addObject(tree79, 6, 4);
        Tree tree80 = new Tree();
        addObject(tree80, 6, 5);
        Tree tree81 = new Tree();
        addObject(tree81, 6, 6);
        Tree tree82 = new Tree();
        addObject(tree82, 6, 7);
        Tree tree83 = new Tree();
        addObject(tree83, 7, 7);
        Tree tree84 = new Tree();
        addObject(tree84, 7, 8);
        Tree tree85 = new Tree();
        addObject(tree85, 6, 8);
        Tree tree86 = new Tree();
        addObject(tree86, 6, 8);
        Tree tree87 = new Tree();
        addObject(tree87, 4, 8);
        Tree tree88 = new Tree();
        addObject(tree88, 3, 8);
        Tree tree89 = new Tree();
        addObject(tree89, 5, 8);
        Tree tree90 = new Tree();
        addObject(tree90, 3, 7);
        Tree tree91 = new Tree();
        addObject(tree91, 4, 6);
        Tree tree92 = new Tree();
        addObject(tree92, 4, 5);
        Tree tree93 = new Tree();
        addObject(tree93, 2, 5);
        Tree tree94 = new Tree();
        addObject(tree94, 4, 4);
        Leaf leaf2 = new Leaf();
        addObject(leaf2, 2, 3);
        Tree tree95 = new Tree();
        addObject(tree95, 5, 4);
        Tree tree96 = new Tree();
        addObject(tree96, 5, 5);
        Tree tree97 = new Tree();
        addObject(tree97, 5, 6);
        Tree tree98 = new Tree();
        addObject(tree98, 5, 7);
        Tree tree99 = new Tree();
        addObject(tree99, 4, 7);
    }
}
