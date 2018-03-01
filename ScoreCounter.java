import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    static int score = 0;
    Color bg = new Color(255,0,0);
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score: "+score, 30, greenfoot.Color.WHITE, bg));
        
    }
   
    public void setScore(int number){
        score = number;
    }
    public static int getScore(){
        return score;
    }
    public void scoreIncrement(){
        score++;
    }
}
