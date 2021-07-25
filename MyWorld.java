import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 10, 50); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        topo topo = new topo();
        addObject(topo,2,4);
        Worm worm = new Worm();
        addObject(worm,0,1);
        Worm worm2 = new Worm();
        addObject(worm2,8,2);
        Worm worm3 = new Worm();
        addObject(worm3,4,0);
        Worm worm4 = new Worm();
        addObject(worm4,5,4);
        Worm worm5 = new Worm();
        addObject(worm5,9,6);
        Worm worm6 = new Worm();
        addObject(worm6,6,8);
        Worm worm7 = new Worm();
        addObject(worm7,3,7);
        Worm worm8 = new Worm();
        addObject(worm8,0,6);
        worm8.setLocation(0,8);
        worm8.setLocation(0,8);
        worm8.setLocation(0,9);
    }
}
