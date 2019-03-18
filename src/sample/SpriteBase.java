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

    public void setX(double x)
    {
        this.x=x;
    }

    public void setY(double y)
    {
        this.y=y;
    }

    public void setDx(double dx)
    {
        this.dx=dx;
    }

    public void setDy(double dy)
    {
        this.dy=dy;
    }

    public void setLayer(Pane layer)
    {
        this.layer=layer;
    }

    public void setEndurance(double endurance)
    {
        this.endurance=endurance;
    }

    public void setHealth(double health)
    {
        this.health=health;
    }

    public void setDamage(double damage)
    {
        this.damage=damage;
    }

    public void setSpeed(double speed)
    {
        this.speed=speed;
    }

    public boolean isAlive()
    {
        if(health>0)
        {
            return true;
        }
        return false;
    }

    public void getDamageFrom()
    {
        health-=getDamage();
    }
}