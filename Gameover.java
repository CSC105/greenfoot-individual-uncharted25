import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gaveover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{
    
    private GreenfootImage bg;
    static GreenfootSound g = new GreenfootSound("gameover.mp3");
    public boolean sound = false;
    private boolean start = false;
    Bg b = new Bg();
    Counter lastScore = Bg.actCounter;
    /**
     * Constructor for objects of class Gaveover.
     * 
     */
    public Gameover()
    {    
        super(640, 480, 1); 
        bg = new GreenfootImage ("ds.jpg");
        bg.scale(640,480);
        setBackground(bg);
        Bg.stopmusic();
        music();
        addObject(lastScore, 320, 60);
        
    }
    public void act(){
        if(!start){
            start = true;
            music();
        }
       if (Greenfoot.isKeyDown("enter")){
           Greenfoot.setWorld(new Bg());
           lastScore.setValue(0);
    }
        
    }
    public void music(){
      g.playLoop();
   }
     public static void stopmusic()
    {
        g.stop();
    }
}
