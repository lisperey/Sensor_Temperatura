module com.example.sensor_temperatura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sensor_temperatura to javafx.fxml;
    exports com.example.sensor_temperatura;
}