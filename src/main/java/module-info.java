module com.isi.bibliotheque {
    requires javafx.controls;
    requires javafx.fxml;
    //requires lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens com.isi.bibliotheque to javafx.fxml;
    opens com.isi.bibliotheque.entities to javafx.fxml;
    exports com.isi.bibliotheque;
    exports com.isi.bibliotheque.controllers;

}