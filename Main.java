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
    //static GreenfootSound s = new GreenfootSound("Shades of Grey");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        checkKeypress();
        main = new GreenfootImage ("main.jpg");
        setBackground(main);
    }
    public void checkKeypress() {        
   
   if (Greenfoot.isKeyDown("enter"))
   {
       
      Bg w1 = new Bg();
      Greenfoot.setWorld(w1);
      
    }
}
}