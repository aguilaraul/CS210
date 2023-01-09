module com.example.roulettesim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.roulettesim to javafx.fxml;
    exports com.example.roulettesim;
}