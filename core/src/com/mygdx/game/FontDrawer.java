package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

/**
 * Created by Long on 2/16/2017.
 */

public  class  FontDrawer {
    static BitmapFont font100;
    static BitmapFont font50;
    static BitmapFont font20;
    static Batch b;
    static FontDrawer drawer;
    FontDrawer(Batch b)
    {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/neuropol x rg.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        FreeTypeFontGenerator.FreeTypeFontParameter parameter1 = new FreeTypeFontGenerator.FreeTypeFontParameter();
        FreeTypeFontGenerator.FreeTypeFontParameter parameter2 = new FreeTypeFontGenerator.FreeTypeFontParameter();

        if(Gdx.graphics.getWidth()>1500) {
            parameter.size = 100;
            parameter1.size = 40;
            parameter2.size = 20;
        }
        else if(Gdx.graphics.getWidth()<1000)
        {
            parameter.size=80;
            parameter.size=30;
            parameter.size=20;
        }


         // font size 12 pixels
        font100 = generator.generateFont(parameter);
        font50 = generator.generateFont(parameter);
        font20=generator.generateFont(parameter);
        generator.dispose();
        this.b=b;
    }

    static void Create(Batch b)
    {
        if(drawer==null)
        {
            drawer = new FontDrawer(b);
        }
    }


    static void drawString100(String s, int x, int y)
    {
        font100.draw(b,s,x,y);
    }

    static void drawString50(String s,int x, int y)
    {
        font50.draw(b,s,x,y);
    }

    static void drawString20(String s,int x, int y)
    {
        font20.draw(b,s,x,y);
    }
}
