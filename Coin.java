import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    GreenfootSound c = new GreenfootSound("MarioCoin.wav");
    Counter a = new Counter();
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setLocation(getX()-1, getY());
         if(isAtEdge()){
            getWorld().removeObject(this);
        }
        
    }    
}
