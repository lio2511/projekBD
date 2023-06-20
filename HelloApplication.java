package com.example.memberview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    //DATABASE CONNECTION
    final static String driver = "com.mysql.cj.jdbc.Driver";
    final static String databaseName = "pbo";
    final static String url = "jdbc:mysql://localhost/" + databaseName;
    final static String user = "root";
    final static String password = "";

    //Stage
    private Stage primaryStage;
    private Scene memberScene;

    //Scene untuk buat order
    private Scene sceneOrder;
    private SceneOrder sceneOrderController;


    //Scene untuk lihat progress
    private Scene sceneProgress;
    private SceneProgress sceneProgressController;


    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        memberScene = new Scene(fxmlLoader.load(), 640, 480);

        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SceneOrder.fxml"));
        sceneOrder = new Scene(fxmlLoader.load(), 640, 480);
        sceneOrderController = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SceneProgress.fxml"));
        sceneProgress = new Scene(fxmlLoader.load(), 640, 480);
        sceneProgressController = fxmlLoader.getController();

        stage.setTitle("Member View");
        stage.setScene(memberScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public HelloApplication() {
        applicationInstance = this;
    }

    private static HelloApplication applicationInstance;

    public static HelloApplication getApplicationInstance(){
        return applicationInstance;
    }


    public Stage getPrimaryStage () {
        return primaryStage;
    }
    public Scene getMemberScene () {
        return memberScene;
    }
    public Scene getSceneOrder () {
        return sceneOrder;
    }

    public SceneOrder getSceneOrderController () {
        return sceneOrderController;
    }

    public Scene getSceneProgress () {
        return sceneProgress;
    }

    public SceneProgress getSceneProgressController () {
        return sceneProgressController;
    }
}