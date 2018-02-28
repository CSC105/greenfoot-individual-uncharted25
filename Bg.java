import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends World
{
    private GreenfootImage bg;
    /**
     * Constructor for objects of class Bg.
     * 
     */
    public Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        bg = new GreenfootImage ("blender_3d_hologram_by_logichy.jpg");
        setBackground(bg);
        Flamingo flamingo = new Flamingo();
        addObject(flamingo,50,350);
    }
}
