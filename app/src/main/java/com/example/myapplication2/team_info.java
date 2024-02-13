package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class team_info extends AppCompatActivity {
    ListView playersList;
    ArrayAdapter<String> playersAdapter;
    ClubHelperClass players;
    Cursor cursor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_info);
        playersList = (ListView) findViewById(R.id.list_view2);
        playersAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        playersList.setAdapter(playersAdapter);
        registerForContextMenu(playersList);
        players = new ClubHelperClass(this);
        cursor2 = players.getPlayers();
        while (!cursor2.isAfterLast()) {
            playersAdapter.add(cursor2.getString(0));
            cursor2.moveToNext();
        }
    
    }
}