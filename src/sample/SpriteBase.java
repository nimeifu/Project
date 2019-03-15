package sample;
import javafx.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;



import java.awt.*;

public abstract class SpriteBase
{
    Image image;
    ImageView iv;
    Pane layer;
    double x;
    double y;
    double dx;
    double dy;
    double endurance;
    double damage;

    public SpriteBase(Pane layer,Image image,double x,double y,double dx,double dy,double endurance,double damage)
    {
        this.layer=layer;
        this.image=image;
        this.iv=new ImageView(String.valueOf(image));

        this.x=x;
        this.y=y;
        this.dx=dx;
        this.dy=dy;
        this.endurance=endurance;
        this.damage=damage;
    }

    public void addToLayer()
    {
        this.layer.getChildren().add(this.iv);
    }



}