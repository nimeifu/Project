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
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.util.Duration;

import java.awt.*;


public class Main extends Application {

    Pane playerfield;

    Image playerImage;
    Image enemyImage;
    Image princenessImage;
    boolean running, goLeft,goRight,jumping;
    double width,height;

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width=screenSize.getWidth();
        height=screenSize.getHeight();
        Scene scene = new Scene(root, width, height, Color.LIGHTBLUE);
        stage.setMaximized(true);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode())
                {
                    case A:goLeft=true;break;
                    case D:goRight=true;break;
                    case SPACE:jumping=true;break;
                    case SHIFT:running=true;break;

                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode())
                {
                    case A:goLeft=false;break;
                    case D:goRight=false;break;
                    case SPACE:jumping=false;break;
                    case SHIFT:running=false;break;
                }
            }
        });

    }














        public void createPlayer()
        {
            Image image=playerImage;
            Player player=new Player(playerfield,,width,height,0,0,100,1,100);

        }


        public static void main (String[]args)
        {
            launch(args);
        }
    }
