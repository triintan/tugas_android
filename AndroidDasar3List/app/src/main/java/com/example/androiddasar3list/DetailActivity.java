package com.example.androiddasar3list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //logt
    private static final String TAG = "DetailActivity";

    TextView tvnamabuah;
    ImageView ivgambarbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarbuah = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);

        //log
        Log.d(TAG, "Nama: "+namabuah);
        Log.d(TAG, "Gambar: "+gambarbuah);

        tvnamabuah = findViewById(R.id.tv_detail_nama);
        ivgambarbuah = findViewById(R.id.iv_detail_gambar);

        tvnamabuah.setText(namabuah);
        ivgambarbuah.setImageResource(gambarbuah);
    }
}
