package com.brh.fxstuff.fx_stuff;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
  private final MusicPlayer musicPlayer = new MusicPlayer();
  protected File file;
  protected boolean musicPlaying = false;


  @FXML
    protected Label fileLabel;

  @FXML
    protected void onFile(){

    Stage stage = (Stage) fileLabel.getScene().getWindow();
    FileChooser fileChooser = new FileChooser();
    file = fileChooser.showOpenDialog(stage);
    fileLabel.setText(file.getAbsolutePath());

  }

  @FXML
  protected void onPlay(){
    if (fileLabel != null && !musicPlaying) {
      musicPlayer.playMusic(file.getAbsolutePath());
      musicPlaying = true;
    }
  }

  @FXML
  protected void onStop(){
    if (fileLabel != null && musicPlaying){
      musicPlayer.stopMusic();
      musicPlaying = false;
    }
  }
}