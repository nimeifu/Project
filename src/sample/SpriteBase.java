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
    double health;
    double damage;
    double speed;

    public SpriteBase(Pane layer,Image image,double x,double y,double dx,double dy,double endurance,double damage,double speed,double health)
    {
        this.layer=layer;
        this.image=image;
        this.iv=new ImageView(String.valueOf(image));

        this.x=x;
        this.y=y;
        this.dx=dx;
        this.dy=dy;
        this.health=health;
        this.speed=speed;
        this.endurance=endurance;
        this.damage=damage;
    }

    public void addToLayer()
    {
        this.layer.getChildren().add(this.iv);
    }

    public Pane getLayer()
    {
        return layer;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getDx()
    {
        return dx;
    }

    public double getDy()
    {
        return dy;
    }

    public double getEndurance()
    {
        return endurance;
    }

    public double getHealth()
    {
        return health;
    }

    public double getDamage()
    {
        return damage;
    }

    public double getSpeed()
    {
        return speed;
    }


}