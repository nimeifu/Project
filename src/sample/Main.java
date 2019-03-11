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


    private static final double W = 600, H = 400;

    private static  String HERO_IMAGE_LOC =
            "http://icons.iconarchive.com/icons/raindropmemory/legendora/64/Hero-icon.png";

    private Image heroImage;
    private Node hero;

    boolean running, goNorth, goSouth, goEast, goWest;

    @Override
    public void start(Stage stage) throws Exception {
        heroImage = new Image(HERO_IMAGE_LOC);
        hero = new ImageView(heroImage);
        Group dungeon = new Group(hero);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        double x=width/2;
        double y=height/1.5;
        hero.relocate(x,y);
        Bounds bs=hero.localToScene(hero.getBoundsInLocal());
        TranslateTransition hh=new TranslateTransition(Duration.millis(4000.00),hero);
        Scene scene = new Scene(dungeon, width, height, Color.LIGHTBLUE);
        stage.setMaximized(true);

        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                if(e.getCode()==KeyCode.LEFT)
                {
                    hh.setByX(-100);
                    hh.play();
                    System.out.println(bs);
                }
            }
        });




    }







        public static void main (String[]args)
        {
            launch(args);
        }
    }
