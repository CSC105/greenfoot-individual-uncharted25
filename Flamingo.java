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
     
    }
    public void chgImg()
    {
        if(this.time == 0)setImage(list.get(0));
        if(this.time == 1){setImage(list.get(1));}
        if(this.time == 2){setImage(list.get(2));}
        if(this.time == 3){setImage(list.get(3));}
        if(this.time == 4){setImage(list.get(4));}
        if(this.time == 5){setImage(list.get(5));}
        if(this.time == 6){setImage(list.get(6));}
        if(this.time == 7){setImage(list.get(7));}
        if(this.time == 8){setImage(list.get(8));}
        if(this.time == 9){setImage(list.get(9));}
        if(this.time == 10){setImage(list.get(10));}
        if(this.time == 11){setImage(list.get(11));}
        if(this.time == 12){setImage(list.get(12));}
        if(this.time == 13){setImage(list.get(13));}
        if(this.time == 14){setImage(list.get(14));}
        if(this.time == 15){setImage(list.get(15));}
        if(this.time == 16){setImage(list.get(16));}
        if(this.time == 17){setImage(list.get(17));}
        if(this.time == 18){setImage(list.get(18));}
        if(this.time == 19){setImage(list.get(19));}
        if(this.time == 20){setImage(list.get(20));}
        if(this.time == 21){setImage(list.get(21));}
        if(this.time == 22){setImage(list.get(22));}
        if(this.time == 23){setImage(list.get(23));}
        if(this.time == 24){setImage(list.get(24));}
        if(this.time == 25){setImage(list.get(25));}
        if(this.time == 26){setImage(list.get(26));}
        if(this.time == 27){setImage(list.get(27));}
        if(this.time == 28){setImage(list.get(28));}
        if(this.time == 29){setImage(list.get(29));}
        if(this.time == 30){setImage(list.get(30));}
        if(this.time == 31){setImage(list.get(31));}
        if(this.time == 32){setImage(list.get(32));}
        if(this.time == 33){setImage(list.get(33));}
        if(this.time == 34){setImage(list.get(34));}
        if(this.time == 35){setImage(list.get(35));}
        if(this.time == 37){this.time=0;}
        time++;
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
