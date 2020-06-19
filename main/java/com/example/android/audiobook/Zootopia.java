package com.example.android.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Zootopia extends AppCompatActivity {

    private static ArrayList<Song> songsList;
    private boolean pFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zootopia);

        songsList = new ArrayList<Song>();
        songsList.add(new Song("01. The First Bunny Cop", "Disney - Zootopia", 4*60 + 16, R.drawable.zootopia1));
        songsList.add(new Song("02. Not Knowing When to Quit", "Disney - Zootopia", 7*60 + 36, R.drawable.zootopia2));
        songsList.add(new Song("03. Graduation", "Disney - Zootopia", 10*60 + 11, R.drawable.zootopia3));
        songsList.add(new Song("04. First Day in Zootopia", "Disney - Zootopia", 5*60 + 15,R.drawable.zootopia4));
        songsList.add(new Song("05. Zootopia Police Department", "Disney - Zootopia", 4*60 + 28, R.drawable.zootopia5));
        songsList.add(new Song("06. Parking Duty", "Disney - Zootopia", 8*60 + 33, R.drawable.zootopia1));
        songsList.add(new Song("07. Con Artist Nick Wilde", "Disney - Zootopia", 9*60 + 44, R.drawable.zootopia2));
        songsList.add(new Song("08. Case of a Missing Otter", "Disney - Zootopia", 4*60 + 39, R.drawable.zootopia3));
        songsList.add(new Song("09. Working With the Fuzz", "Disney - Zootopia", 3*60 + 24, R.drawable.zootopia4));
        songsList.add(new Song("10. Flash, the DMV Sloth", "Disney - Zootopia", 5*60 + 16, R.drawable.zootopia5));
        songsList.add(new Song("11. Tiny Arctic Shrew, Mr.Big", "Disney - Zootopia",4*60 + 57, R.drawable.zootopia1));
        songsList.add(new Song("12. Going Savage", "Disney - Zootopia",7*60 + 23, R.drawable.zootopia2));
        songsList.add(new Song("13. Night Howlers", "Disney - Zootopia",6*60 + 42, R.drawable.zootopia3));
        songsList.add(new Song("14. Arresting Lionheart", "Disney - Zootopia",8*60 + 13, R.drawable.zootopia4));
        songsList.add(new Song("15. Giving Up the Badge", "Disney - Zootopia",4*60 + 55, R.drawable.zootopia5));
        songsList.add(new Song("16. Flower Name", "Disney - Zootopia",5*60 + 17, R.drawable.zootopia1));
        songsList.add(new Song("17. Selling Night Howlers to Ram", "Disney - Zootopia",8*60 + 19, R.drawable.zootopia2));
        songsList.add(new Song("18. Pellets of Night Howler Toxin", "Disney - Zootopia",8*60 + 19, R.drawable.zootopia3));
        songsList.add(new Song("19. Bellwether Being Nailed", "Disney - Zootopia",4*60 + 50, R.drawable.zootopia4));
        songsList.add(new Song("20. Change Starting With Me", "Disney - Zootopia",10*60 + 29, R.drawable.zootopia5));

        ListView songsLV = (ListView) findViewById(R.id.main_songs_list);

        SongAdapter adapter = new SongAdapter(this, songsList);
        songsLV.setAdapter(adapter);

        songsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song clickedSong = (Song) parent.getItemAtPosition(position);
                Intent intent = new Intent(Zootopia.this, NowPlaying.class);
                intent.putExtra("song_name", clickedSong.getName());
                intent.putExtra("artist_name", clickedSong.getArtist());
                intent.putExtra("duration", clickedSong.getDuration());
                intent.putExtra("image", clickedSong.getImgResId());
                startActivity(intent);
            }
        });

    }
}


