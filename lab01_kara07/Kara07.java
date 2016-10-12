import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kara06 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kara07 extends Kara{

    int expectedResult = 0;
    int karasResult = 0;

    public Kara07(int expectedResult){
        super();
        this.expectedResult = expectedResult;
    }

    /**
     * Act - do whatever the Kara06 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if (mushroomFront()) {
            checkResult();
            Greenfoot.stop();
        } else {
            // Add your action code here.
            move();
        }
    }  

    public void checkResult(){
        turnRight();
        turnRight();
        int karasResult = 0;
        for (int stelle = 8;stelle>= 0;stelle--){
            move();
            if (onLeaf()){
                karasResult += Math.pow(2,stelle);
            }
        }
        move();
        if (expectedResult != karasResult){
            System.out.println("Kara hat nicht richtig gerechnet!");
            System.out.println("Karas Ergebnis: "+karasResult+", es hätte sein sollen: "+expectedResult);
            System.out.println("Kara: "+Integer.toBinaryString(karasResult)+ " expected: "+Integer.toBinaryString(expectedResult));
        } else {
            System.out.println("Kara hat richtig gerechnet! "+ Integer.toBinaryString(karasResult));
        }
        

    }
}

