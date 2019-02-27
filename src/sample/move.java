package sample;

import java.awt.*;
import java.awt.event.KeyEvent;

public class move {
    Dimension screesize=Toolkit.getDefaultToolkit().getScreenSize();
    private double Width=screesize.getWidth()/2;
    private double Height=screesize.getHeight()/1.5;
    public double x;

    public move(double width,double height)
    {
        this.Width=width;
        this.Height=height;
    }
    public void keyPressed(KeyEvent e)
    {
        int key=e.getKeyCode();

        if(key== KeyEvent.VK_LEFT)
        {
            this.Width +=-2;
        }

        if(key==KeyEvent.VK_RIGHT)
        {
            this.Width +=2;
        }

        if(key==KeyEvent.VK_LEFT && key==KeyEvent.VK_SHIFT)
        {
            this.Width+=-4;
        }

        if(key==KeyEvent.VK_RIGHT && key==KeyEvent.VK_SHIFT)
        {
            this.Width+=4;
        }
    }

    public void action()
    {
        x+=Width;
    }




}
