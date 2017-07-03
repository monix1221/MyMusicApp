package com.example.android.musicplayer.Helpers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.android.musicplayer.LovedActivity;
import com.example.android.musicplayer.MainActivity;
import com.example.android.musicplayer.MarketActivity;
import com.example.android.musicplayer.PlaylistActivity;
import com.example.android.musicplayer.R;
import com.example.android.musicplayer.TracksActivity;

/**
 * Created by monika on 2017-07-03.
 */

public class BaseMenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_loved:
                Intent intent1 = new Intent(getApplicationContext(), LovedActivity.class);
                startActivity(intent1);
                return true;
            case R.id.action_market:
                Intent intent2 = new Intent(getApplicationContext(), MarketActivity.class);
                startActivity(intent2);
                return true;
            case R.id.action_playlist:
                Intent intent3 = new Intent(getApplicationContext(), PlaylistActivity.class);
                startActivity(intent3);
                return true;
            case R.id.action_track:
                Intent intent4 = new Intent(getApplicationContext(), TracksActivity.class);
                startActivity(intent4);
                return true;
            case R.id.action_home:
                Intent intent5 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent5);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}