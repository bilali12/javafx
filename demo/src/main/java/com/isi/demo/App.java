package com.isi.demo;

import com.isi.demo.config.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

public class App extends Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        launch(args);
        sessionFactory.close();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/hello.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Connexion");
        stage.setScene(scene);
        stage.show();
    }

}
