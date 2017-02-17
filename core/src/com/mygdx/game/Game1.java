package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 * Created by Long on 2/16/2017.
 */
//this will be an input processing game. Kind of like dance dance revolution but themed on building walls.
public class Game1 {
    int score = 0;
    float wHalf;// -
    float hHalf;//  |
    float delay;
    int count;
    int selection;
    float render;
    public Game1(float width, float length)
    {
        wHalf = width/2;
        hHalf = length/2;
        delay =120;
    }

    public void logic(float renderTime)
    {
        count++;
        if(count%delay==0)
        {
            count = 0;
            selection = (int)(Math.random()*5); //0-4 // 4 is empty;
        }
    }


    public void processInput(float x, float y)
    {
        if(x>wHalf&&y>hHalf) //top right
        {
            if(selection==0)
            {
                count=-1;
                score=score+100;
            }
        }
        else if(x>wHalf&&y<hHalf)//bottom right
        {

            if(selection==1)
            {
                count=-1;
                score=score+100;
            }

        }
        else if(x<wHalf&&y>hHalf) //top left
        {

            if(selection==2)
            {
                count=-1;
                score=score+100;
            }

        }
        else if(x<wHalf&&y<hHalf)//bottom left
        {

            if(selection==3)
            {
                count=-1;
                score=score+100;
            }
        }
    }

    public void render(Batch batch)
    {
        FontDrawer.drawString20(""+count+" "+selection+ Gdx.graphics.getFramesPerSecond(),20,20);
        FontDrawer.drawString100("Score"+score+ " Selection:"+selection,(int)wHalf,(int)hHalf);
    }






}
