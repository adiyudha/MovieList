package com.example.yudha.yudha;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetailFilem extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_filem);

        Filem f = (Filem) getIntent().getSerializableExtra("F");
        TextView txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(f.getTxtTitle());
        TextView txtOverview = (TextView) findViewById(R.id.txtSynopsisContent);
        txtOverview.setText(f.getTxtOverview());
        TextView txtRelease = (TextView) findViewById(R.id.txtDate);
        txtRelease.setText(" "+f.getReleaseDate());
        ImageView imgPoster = (ImageView) findViewById(R.id.ivPoster);
        Glide.with(getApplicationContext())
                .load(f.getImgPoster())
                .override(350, 350)
                .into(imgPoster);
        TextView txtRating = (TextView) findViewById(R.id.txtRating);
        txtRating.setText(" "+f.getRating());
    }
}
