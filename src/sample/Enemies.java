package sample;

import javafx.scene.layout.Pane;

import java.awt.*;

public class Enemies extends SpriteBase {
    public Enemies(Pane layer, Image image, double x, double y, double dx, double dy, double endurance, double damage, double speed, double health) {
        super(layer, image, x, y, dx, dy, endurance, damage, speed, health);
    }
}
