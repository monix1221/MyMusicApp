package com.example.android.musicplayer;

import android.os.Bundle;

import com.example.android.musicplayer.Helpers.BaseMenuActivity;

public class TracksActivity extends BaseMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);
    }
}
