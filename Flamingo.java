import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    private int  time  = 0;
    private List<GreenfootImage> list = new ArrayList<GreenfootImage>();
    private GreenfootImage[] img = new GreenfootImage[37];
    
    public Flamingo(){
        addPic();
   
}
    public void act() 
    {
        chgImg();
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
    }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
            removeTouching(Coin.class);
            removeTouching(Banana.class);
            
        
     
    }
  
    public void chgImg()
    {
        if(time < 36){
            setImage(list.get(time));
            time++;
        }
        else{
            time = 0;
        }
       
    }
    public  void addPic()
    {
       for(int i = 1; i <=36 ; i++)
       {
            GreenfootImage img = new GreenfootImage("Flamingo"+i+".png");
            img.scale(70,70);
            list.add(img);
       }
    }
}
