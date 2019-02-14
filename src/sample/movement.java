package sample;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.awt.*;
import java.awt.event.KeyEvent;

public class movement {
    private Image image;
    private double positionX ;
    private double positionY;
    private double width;
    private double height;


    public void setImage(Image i)
    {
        image=i;
        width=i.getWidth();
        height=i.getHeight();
    }

    public void setImage(String file)
    {
        Image i=new Image(file);
        setImage(i);

    }
   public void keyPress(KeyEvent e)
   {
       int key=e.getKeyCode();
       if(key==KeyEvent.VK_A)
       {
           positionX+=-2.00;
       }
       if(key==KeyEvent.VK_D)
       {
           positionX+=2.00;
       }
   }

   public void setPostion(double x,double y)
   {
       positionX=x;
       positionY=y;
   }



}
