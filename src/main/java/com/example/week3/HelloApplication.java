package com.example.week3;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import static javafx.application.Application.launch;


public class HelloApplication extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        HBox pane = new HBox(10);
        Button btOK = new Button("OK");
        //create a button( create a new object from the Button class)
        Button bt1=new Button("Cancel");



        //OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Look, an Information Dialog");
                alert.setContentText("OKay is clicked!");
                alert.showAndWait();

            }

        });

       // MervatHandlerClass hand2=new MervatHandlerClass();
        bt1.setOnAction(e->{

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Look, an Information Dialog");
            alert.setContentText("Mervat clicked cancel Button!");
            alert.showAndWait();
        });


        pane.getChildren().addAll(btOK, bt1);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("CLICK LISTENER ");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
        /* class OKHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Look, an Information Dialog");
            alert.setContentText("OKay is clicked!");
            alert.showAndWait();

        }
        }

    class MervatHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Look, an Information Dialog");
            alert.setContentText("Mervat clicked cancel Button!");
            alert.showAndWait();


        }}*/


    public static void main(String[] args) {
        launch();

    }
}
