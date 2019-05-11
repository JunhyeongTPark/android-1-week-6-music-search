package com.ucsdextandroid1.musicsearch;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;
import com.ucsdextandroid1.musicsearch.data.SongItem;
import com.ucsdextandroid1.musicsearch.utils.Utils;

public class MusicDetailsActivity extends AppCompatActivity {

    private TextView trackName = null;
    private ImageView artwork = null;
    private TextView artistName = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_details);

        this.trackName = (TextView) findViewById(R.id.trackName);
        this.artistName = (TextView) findViewById(R.id.artistName);
        this.artwork = (ImageView) findViewById(R.id.artwork);

        SongItem songItem = getIntent().getParcelableExtra("song");

        if(songItem != null){
            trackName.setText(songItem.getTrackName());
            artistName.setText(songItem.getArtistName());

            Picasso.get().load(songItem.getArtworkUrl())
                    .placeholder(new ColorDrawable(Utils.randomColor()))
                    .into(artwork);
        }
    }
}
