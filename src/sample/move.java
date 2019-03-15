package sample;
import javafx.*;
import javafx.scene.layout.Pane;

import javax.swing.text.html.ImageView;
import java.awt.*;

public abstract class move
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

    public move(Pane layer,Image image,double x,double y,double dx,double dy,double endurance,double damage)
    {
        this.layer=layer;
    }



}