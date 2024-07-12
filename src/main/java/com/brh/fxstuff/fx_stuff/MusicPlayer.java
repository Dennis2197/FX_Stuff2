package com.brh.fxstuff.fx_stuff;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MusicPlayer {
    private MediaPlayer mp;
    public void playMusic(String path){
        Media media = new Media(new File(path).toURI().toString());
        mp = new MediaPlayer(media);
        mp.play();
    }
    public void stopMusic(){
        if (mp != null) mp.stop();
    }
}
