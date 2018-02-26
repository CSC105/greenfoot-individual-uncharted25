import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Flamingo(){
        
    addPic();
}
    public void act() 
    {
        // Add your action code here.
    }
    public  void addPic()
    {
       for(int i = 0; i < 34; i++)
       {
            GreenfootImage img = new GreenfootImage("Flamingo"+i+".png");
            img.scale(100,200);
            
       }
    }
}
