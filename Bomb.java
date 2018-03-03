import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    GreenfootSound b = new GreenfootSound("Explosion.wav");
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-10, getY());
         if(isAtEdge()){
            getWorld().removeObject(this);
        }
         /*if(isTouching(Flamingo.class)){
            b.play();
            Greenfoot.setWorld(new Gameover());
            }*/
    }    
}
