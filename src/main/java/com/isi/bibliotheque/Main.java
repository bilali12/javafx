package com.isi.bibliotheque;

import com.isi.bibliotheque.dao.DAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {
    public static void main(String[] args) {
        Book book = new Book();
        DAO dao = new DAO();
        dao.persist(book);
        launch(args);
        dao.closeEntityManager();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/authentication.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Connexion");
        stage.setScene(scene);
        stage.show();

    }
}
