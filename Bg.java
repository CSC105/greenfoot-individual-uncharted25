import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends World
{
    private GifImage bg;
    static GreenfootSound dejavu = new GreenfootSound("Dejavu.mp3");
    public boolean sound = false;
    private boolean start = false;
    int score=0;
    int randomY;
    int randomDelay = Greenfoot.getRandomNumber(200);
    int randomObject;
    int count = 0;
    static int add;
    static Counter actCounter = new Counter("Scores: ");
    /**
     * Constructor for objects of class Bg.
     * 
     */
    public Bg()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        bg = new GifImage ("giphy.gif");
        Flamingo flamingo = new Flamingo();
        addObject(flamingo,50,330);
        addObject(actCounter, 320, 60);
        
        Gameover.stopmusic();
    }

    public void Animated(){
        setBackground(bg.getCurrentImage());
    }

    public void act(){
        if(!start){
            start = true;
            music();
        }
        Animated();
        randomY = Greenfoot.getRandomNumber(480);
        randomObject = Greenfoot.getRandomNumber(3);
        
        if(count==randomDelay){
            if(randomObject == 0){
                addObject(new Coin(), 639, randomY);
            }else if(randomObject == 1){
                addObject(new Bomb(), 639, randomY);
            }else if(randomObject == 2){
                addObject(new Banana(), 639, randomY);
            }
            randomDelay = Greenfoot.getRandomNumber(200);
            count = 0;
        } else {
            count++;
        }
        actCounter.add(add);
        add = 0;
    }

    public void music(){
        dejavu.playLoop();
    }

    public static void stopmusic()
    {
        dejavu.stop();
    }
   public void addScore(int score){
       actCounter.setValue(actCounter.getValue() + score);
       
    }
}

