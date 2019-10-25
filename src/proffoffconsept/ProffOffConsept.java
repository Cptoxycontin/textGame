/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proffoffconsept;

import javafx.scene.control.Button;
//import java.awt.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Tanner
 */
public class ProffOffConsept extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage window) {
        window.setTitle("Concept Run");

        StackPane root = new StackPane();
        Text text = new Text("Hello World!");
        root.getChildren().add(text);

        Button button = new Button("new Button");
        root.getChildren().add(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello NErds");
            }
        });

        Scene scene = new Scene(root, 400, 400);
        window.setScene(scene);
        window.show();

//        window.setResizable(false);
//        window.setOpacity(0.5);
//        window.setAlwaysOnTop(true);
    }

    public void handle(ActionEvent event) {
        System.out.println("Hello World! XD");
    }

}
