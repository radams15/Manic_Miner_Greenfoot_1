import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score;
    
    public int setScore(int score){
        return this.score = score;
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Score: " + String.format("%06d", score), 20, Color.WHITE, Color.BLACK));
    }    
}
