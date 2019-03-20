package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Enemies extends SpriteBase {
    public Enemies(Pane layer, Image image, double x, double y, double dx, double dy,double damage, double speed, double health) {
        super(layer, image, x, y, dx, dy, damage, speed, health);
    }
}
