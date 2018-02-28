import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{
    //private boolean start = false;
    private GreenfootImage main;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        
        main = new GreenfootImage ("main.jpg");
        setBackground(main);
    }
    public void act() {        
   
   if (Greenfoot.isKeyDown("enter"))
   {
       Greenfoot.setWorld(new Bg());
      
    }
}
}