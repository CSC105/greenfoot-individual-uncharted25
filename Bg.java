import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends World
{
    //private GreenfootImage tex;
    private GifImage bg;
    static GreenfootSound dejavu = new GreenfootSound("Dejavu.mp3");
    public boolean sound = false;
    private boolean start = false;
    int score;
    int randomY;
    int randomDelay = Greenfoot.getRandomNumber(200);
    int randomObject;
    int count = 0;
    /**
     * Constructor for objects of class Bg.
     * 
     */
    public Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        //bg = new GreenfootImage ("blender_3d_hologram_by_logichy.jpg");
        bg = new GifImage ("giphy.gif");
        //setBackground(bg);
        Flamingo flamingo = new Flamingo();
        addObject(flamingo,50,330);
        /*new ScoreCounter().setScore(0);
        addObject(new ScoreCounter(),320, 60);*/
        /*ScoreBoard sc = new ScoreBoard(320, 60);
        addObject(sc, 320, 60);*/
         
         Counter actCounter = new Counter("Socres: ");
         addObject(actCounter, 320, 60);

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

    }

    public void music(){
        dejavu.playLoop();
    }

    public static void stopmusic()
    {
        dejavu.stop();
    }
}

