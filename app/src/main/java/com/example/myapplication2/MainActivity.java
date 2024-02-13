package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication2.ClubHelperClass;
import com.example.myapplication2.team_info;
import com.example.myapplication2.team_matches;

public class MainActivity extends AppCompatActivity {
    ListView clubsList;
    ArrayAdapter<String> clubsAdapter;
    ClubHelperClass clubs;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clubsList = (ListView) findViewById(R.id.list_view);
        clubsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        clubsList.setAdapter(clubsAdapter);
        registerForContextMenu(clubsList);
        clubs = new ClubHelperClass(this);
        cursor = clubs.clubsData();
        while (!cursor.isAfterLast()) {
            //clubsAdapter.add(cursor.getString(0));
            clubsAdapter.addAll(cursor.getString(0) + " "+ cursor.getString(1) + " " + cursor.getString(2) + " " + cursor.getString(3) + " " + cursor.getString(4) + " "
                    + cursor.getString(5) + " " + cursor.getString(6));
            cursor.moveToNext();
        }
        
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.con_menu,menu);
    }
    
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        //String selectedClub = ((TextView)info.targetView).getText().toString();
        if(item.getItemId() == R.id.item_players){
            Intent intent= new Intent(MainActivity.this, team_info.class);
            cursor.moveToPosition(info.position);
            //intent.putExtra("team_ID",cursor.getInt(0));
            //Cursor cursor1= clubs.getPlayers(selectedClub);
            /*while (!cursor1.isAfterLast()){
                clubsAdapter.add(cursor1.getString(0));
                cursor1.moveToNext();
            }*/
            clubsAdapter.notifyDataSetChanged();
            startActivity(intent);
            return true;
            
        }
        else if(item.getItemId() == R.id.item_matches){
            Intent intent1= new Intent(MainActivity.this, team_matches.class);
            startActivity(intent1);
            return true;
        }
        return super.onContextItemSelected(item);
    }
    
}
