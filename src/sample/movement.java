package sample;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.awt.*;
import java.awt.event.KeyEvent;

public class movement {
    private Image image;
    private double positionX =50.00;
    private double positionY;
    private double width;
    private double height;

    public void loadImage()
    {
        ImageView iv=new ImageView();
        Image image=new Image("");
        iv.setImage(image);
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

}
