package com.example.roulettesim;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class GameController {
    @FXML
    private MenuItem statsMenu;

    @FXML
    protected void onStatsMenuClick() {
        statsMenu.setOnAction(e -> StatsWindow.display());
    }
}
