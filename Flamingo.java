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
    GreenfootSound c = new GreenfootSound("MarioCoin.wav");
    GreenfootSound b = new GreenfootSound("Explosion.wav");
    GreenfootSound a = new GreenfootSound("banana.mp3");
    Counter count = new Counter();
    //ScoreCounter sc = new ScoreCounter();
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
            if(isTouching(Bomb.class)){
            b.play();
            removeTouching(Bomb.class);
            Greenfoot.setWorld(new Gameover());
           
            }
            if(isTouching(Coin.class)){
            c.play();
            ((Bg) getWorld()).addScore(500);
            removeTouching(Coin.class);
            
            }
            if(isTouching(Banana.class)){
                a.play();
                ((Bg) getWorld()).addScore(100);
                removeTouching(Banana.class);
               
            }
       
     
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
    public  void addPic(){ //Using ArrayList to store Flamingo images
       for(int i = 1; i <=36 ; i++)
       {
            GreenfootImage img = new GreenfootImage("Flamingo"+i+".png");
            img.scale(70,70);
            list.add(img);
       }
    }
}
