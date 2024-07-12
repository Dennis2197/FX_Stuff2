package com.brh.fxstuff.fx_stuff;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
  private final MusicPlayer musicPlayer = new MusicPlayer();

  @FXML
    protected Label fileLabel;

  @FXML
    protected void onFile(){

    Stage stage = (Stage) fileLabel.getScene().getWindow();
    FileChooser fileChooser = new FileChooser();
    File file = fileChooser.showOpenDialog(stage);
    fileLabel.setText(file.getAbsolutePath());

  }

/*  @FXML
  protected void onPlay(){
    if (fileLabel != null) {
    }
  }*/
}