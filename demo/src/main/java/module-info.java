module com.isi.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;


    opens com.isi.demo to javafx.fxml;
    exports com.isi.demo;
    exports com.isi.demo.controller;
}