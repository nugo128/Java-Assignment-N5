module com.example.java_nugzari_rostiashvili {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.junit.jupiter.api;


    opens com.example.java_nugzari_rostiashvili to javafx.fxml;
    exports com.example.java_nugzari_rostiashvili;
}