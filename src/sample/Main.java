package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    int clicks=0;

    @Override
    public void start(Stage primaryStage) throws Exception{



        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Orders");
        primaryStage.getIcons().add(new Image("sample/IMG/ikon.jpg"));

        //primaryStage.setResizable(false);
        root.styleProperty().setValue(" -fx-background-color: white;  -fx-border-color: white; -fx-border-width: 7px;");


        Menu mn = new Menu("my menu");
        MenuItem mi1 = new MenuItem("Happy");
        MenuItem mi2 = new MenuItem("Happy2");
        MenuItem mi3 = new MenuItem("Happy3");
        MenuItem quit = new MenuItem("Quit");

        mn.getItems().add(mi1);
        mn.getItems().add(mi2);
        mn.getItems().add(mi3);
        mn.getItems().add(quit);
        quit.setOnAction(e-> Platform.exit());
        //mi1.setText("newName");
        Label labelmi2 = new Label("counter");
        labelmi2.setLabelFor(labelmi2);
        mi2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clicks++;
                labelmi2.setText(String.valueOf(clicks));



            }
        });
        MenuBar mb = new MenuBar();
        mb.getMenus().add(mn);
        /*VBox v = new VBox(mb);
        Scene scn = new Scene(v,480,515);
        primaryStage.setScene(scn);
        primaryStage.show();*/
        ((GridPane)root).getChildren().add(mb);


        primaryStage.setScene(new Scene(root, 600, 700));
        primaryStage.show();

    }


    public static void main(String[] args) {

        launch(args);



    }
}
