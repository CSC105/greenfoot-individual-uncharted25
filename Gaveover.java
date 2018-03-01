import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gaveover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gaveover extends World
{
    private GreenfootImage bg;
    static GreenfootSound ps1 = new GreenfootSound("ps1.mp3");
    public boolean sound = false;
    private boolean start = false;
    /**
     * Constructor for objects of class Gaveover.
     * 
     */
    public Gaveover()
    {    
        super(640, 480, 1); 
        bg = new GreenfootImage ("ds.jpg");
        bg.scale(640,480);
        setBackground(bg);
        Bg.stopmusic();
        music();
    }
    public void music(){
      ps1.playLoop();
   }
}
