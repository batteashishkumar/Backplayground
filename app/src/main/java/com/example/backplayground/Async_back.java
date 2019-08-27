package com.example.backplayground;

import android.media.MediaPlayer;
import android.os.AsyncTask;

public class Async_back extends AsyncTask<String,String,String> {
    MediaPlayer player;

    @Override
    protected String doInBackground(String... strings) {
        player = (MediaPlayer) MediaPlayer.create(MainActivity.getInstance(), R.raw.song);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        player.start();
        return null;
    }
}
