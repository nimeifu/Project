package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.util.Duration;

import java.awt.*;


public class Main extends Application {


    Image playerImage;
    Image enemyImage;
    Image princenessImage;




    boolean running, goNorth, goSouth, goEast, goWest;

    @Override
    public void start(Stage stage) throws Exception {

        Group dungeon = new Group(hero);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        Bounds bs=hero.localToScene(hero.getBoundsInLocal());
        TranslateTransition hh=new TranslateTransition(Duration.millis(4000.00),hero);
        Scene scene = new Scene(dungeon, width, height, Color.LIGHTBLUE);
        stage.setMaximized(true);


        AnimationTimer gameLoop=new AnimationTimer() {
            @Override
            public void handle(long now) {

            }
        }






    }







        public static void main (String[]args)
        {
            launch(args);
        }
    }
