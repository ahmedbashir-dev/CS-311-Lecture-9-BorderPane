package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Button[] buttons;
    private BorderPane borderPane;
    @Override
    public void start(Stage primaryStage) throws Exception{
        buttons = new Button[15];
        for (int i = 0; i < buttons.length ; i++) {
            buttons[i] = new Button("Button # " + (i+1));
        }
        VBox vBoxLeft, vBoxRight;
        vBoxLeft = new VBox();
        vBoxRight = new VBox();
        for (int i = 5; i < 10 ; i++) {
            vBoxLeft.getChildren().add(buttons[i]);
        }
        for (int i = 10; i < 15 ; i++) {
            vBoxRight.getChildren().add(buttons[i]);
        }
        borderPane = new BorderPane(); //creates an empty BorderPane
        borderPane.setTop(buttons[0]);
        borderPane.setBottom(buttons[1]);
        borderPane.setCenter(buttons[2]);
        borderPane.setRight(vBoxRight);
        borderPane.setLeft(vBoxLeft);

        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setTitle("BorderPane Demo");
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
