package com.example.android.musicplayer;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.android.musicplayer.Helpers.BaseMenuActivity;
import com.example.android.musicplayer.databinding.ActivityMainBinding;

public class MainActivity extends BaseMenuActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setOnClickListenersToButtons();
    }

    private void setOnClickListenersToButtons() {

        mainBinding.tracksButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TracksActivity.class);
                startActivity(intent);
            }
        });

        mainBinding.lovedButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LovedActivity.class);
                startActivity(intent);
            }
        });

        mainBinding.playlistButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlaylistActivity.class);
                startActivity(intent);
            }
        });

        mainBinding.marketButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MarketActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.removeItem(R.id.action_loved);
        menu.removeItem(R.id.action_market);
        menu.removeItem(R.id.action_playlist);
        menu.removeItem(R.id.action_track);
        return true;
    }
}