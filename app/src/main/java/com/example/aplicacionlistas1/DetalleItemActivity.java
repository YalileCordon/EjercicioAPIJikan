package com.example.aplicacionlistas1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.aplicacionlistas1.model.model.Anime;

public class DetalleItemActivity extends AppCompatActivity {

    private ImageView imgAnime;
    private TextView txtName;
    private TextView txtSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_item);

        imgAnime = findViewById(R.id.imgpanime);
        txtName = findViewById(R.id.txtNameAnime);
        txtSurname = findViewById(R.id.txtSurnameAnime);

        Anime anime = (Anime) getIntent().getSerializableExtra("anime");

        Glide.with(this).load(anime.getImages().getJpg().getLargeImageUrl()).into(imgAnime);
        txtName.setText(anime.getTitle());
        txtSurname.setText(anime.getType());
    }
}
